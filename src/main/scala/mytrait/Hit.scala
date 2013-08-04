package mytrait

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-2
 * Time: 上午10:01
 *
 */
class Hit extends Logger{
//   override def log= {
//    println("sss")
//  }
}

class Hit2 extends Hit with Logger with RedisLogger

trait Logger{
  val classname=super.getClass.getName
  def log  =println("mytmytmyttttttttttttt")
}

trait RedisLogger extends Logger{
  abstract override def log= {
    super.log
    println("redis logger")
  }
}

object Main{
  def main(args: Array[String]) {
    val hit=new Hit2
    hit.log
    println(hit.classname)
  }
}