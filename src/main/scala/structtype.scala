/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-4
 * Time: 下午8:07
 *
 */
class structtype {
  def using[T <: {def close() : Unit}, S](obj: T)
                                         (operation: T => S) = {
    val result = operation(obj)
    obj.close()
    result
  }


}

object Color extends Enumeration {
  val Red, Green, Blue = Value
}

object Direction extends Enumeration {
  val North = Value("North")
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")
}



object Main {
  def main(args: Array[String]) {
    println(Color.Red)
    println(Color.Red==Color.Blue)

    for (d <- Direction.values) print(d +" ")
    for (d <- Color.values) print(d +" ")

    println(Color.Blue)
    println(Color.Red)
    println(Direction.South)
    new TestMe {}
    println("ok")
    println("ok")
  }
}

abstract class TestMe




