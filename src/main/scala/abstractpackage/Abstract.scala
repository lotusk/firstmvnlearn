package abstractpackage

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-2
 * Time: 下午10:30
 *
 */
trait Abstract {
    type T
    def transform(x: T): T
    val initial: T
    var current: T

}

class Concrete extends Abstract {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial
}


object Main{
  def main(args: Array[String]) {
    val c=new Concrete
    println(c.initial)
  }
}
