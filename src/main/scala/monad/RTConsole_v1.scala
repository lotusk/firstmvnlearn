package monad


/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-8
 * Time: 下午1:55
 *
 */
object RTConsole_v1 {
  def getString(state: WorldState) =
    (state.nextState, Console.readLine)

  def putString(state: WorldState, s: String) =
    (state.nextState, Console.print(s))

}


//file RTIO.scala
sealed trait WorldState {
  def nextState: WorldState
}

abstract class IOApplication_v1 {

  private class WorldStateImpl(id: BigInt)
    extends WorldState {
    def nextState = new WorldStateImpl(id + 1)
  }

  final def main(args: Array[String]): Unit = {
    iomain(args, new WorldStateImpl(0))
  }

  def iomain(
              args: Array[String],
              startState: WorldState): (WorldState, _)
}

// file HelloWorld.scala
class HelloWorld_v1 extends IOApplication_v1 {

  import RTConsole_v1._

  def iomain(
              args: Array[String],
              startState: WorldState) =
    putString(startState, "Hello world")
}






/**
 * The 3rd property said that the world can only be in one state at any given moment in time. I haven't solved that one yet and here's why it's a problem
 */
class Evil_v1 extends IOApplication_v1 {

  import RTConsole_v1._

  def iomain(
              args: Array[String],
              startState: WorldState) = {
    val (stateA, a) = getString(startState)
    val (stateB, b) = getString(startState)
    assert(a == b)
    (startState, b)
  }
}


object MyMain{
  def main(args: Array[String]) {
//    val t=new Evil_v1
//    t.main(args)

    val s=new   HelloWorld_v1
    s.main(args)
  }
}
