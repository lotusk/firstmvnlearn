package monad.v4

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-8
 * Time: 下午5:31
 *
 */
object RTConsole_v4 {
  def getString = IOAction_v4(Console.readLine)
  def putString(s: String) =
    IOAction_v4(Console.print(s))
}

//file RTIO.scala
sealed abstract class IOAction_v4[+A] extends Function1[WorldState, (WorldState, A)] {
  def map[B](f:A => B):IOAction_v4[B] =
    flatMap {x => IOAction_v4(f(x))}
  def flatMap[B](f:A => IOAction_v4[B]):IOAction_v4[B]=
    new ChainedAction(this, f)

  private class ChainedAction[+A, B](
                                      action1: IOAction_v4[B],
                                      f: B => IOAction_v4[A]) extends IOAction_v4[A] {
    def apply(state1:WorldState) = {
      val (state2, intermediateResult) =
        action1(state1);
      val action2 = f(intermediateResult)
      action2(state2)
    }
  }
}


object IOAction_v4 {
  def apply[A](expression: => A):IOAction_v4[A] =
    new SimpleAction(expression)

  private class SimpleAction[+A](expression: => A)
    extends IOAction_v4[A] {
    def apply(state:WorldState) =
      (state.nextState, expression)
  }
}

// the rest remains the same
sealed trait WorldState{def nextState:WorldState}

abstract class IOApplication_v4 {
  private class WorldStateImpl(id:BigInt)
  extends WorldState {
  def nextState = new WorldStateImpl(id + 1)
}
  final def main(args:Array[String]):Unit = {
    val ioAction = iomain(args)
    ioAction(new WorldStateImpl(0));
  }
  def iomain(args:Array[String]):IOAction_v4[_]
}

object HelloWorld_v4 extends IOApplication_v4 {
  import RTConsole_v4._
  def iomain(args:Array[String]) = {
    for{
      _ <- putString(
        "This is an example of the IO monad.");
      _ <- putString("What's your name?");
      name <- getString;
      _ <- putString("Hello " + name)
    } yield ()
  }
}

object MyMain{
  def main(args: Array[String]) {
    HelloWorld_v4.main(args)
  }
}
