package worksheets.books

/**
 * Created with IntelliJ IDEA.
 * User: lucifer
 * Date: 13-7-30
 * Time: 下午10:04
 * To change this template use File | Settings | File Templates.
 */
object CollectionTest {
  def main(args: Array[String]) {
    val a=new TestA("hello")
    val b=new TestA("h2")
    val s=Set(a,b)
    s.toList.foreach {
      x =>
        x.a=x.a+"change"
    }

    s.foreach(x=>println(x.a))

  }
}


object testa{

  val b=a+"tttt"
  val a="abc"

  println(b +"  "+a)
}


class TestA(var a:String)