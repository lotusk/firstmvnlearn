package worksheets
import scala.math._

object Hi {
//val PA = """.*(\d+).*""".r
//"ad_555|" match { case PA(a) => println(a) case _ => println("none")}

val PA = """.*?(\d+).*""".r
"ad_555|" match { case PA(a) => println(a) case _ => println("none")}
                                                  123 to 1234
  println("Welcome to the Scala worksheet")
  val email="abc@summ.com"
  email.split("@").head
  val a=List(1,2,3,4,5,6,7,8,9,10)
  a map (_ * 2)
  a filter ( _ >5)
  
  trait EmailMessages{
	val url:String
	val msg:String
}
  
  case class Result(url:String) extends EmailMessages{
  	val msg=null
  }
  
  val abc:EmailMessages =Result("test")
  
  abc.url
  (1 to Int.MaxValue).iterator
  
  val page=3
  val size=8
  val total=16
  val test=111
  ((Math.max(1,page-10) to page) toList) ::: ((page+1 to page+10) toList)
                                                  
 	val pageNum= (if(total%size==0)total/size else total/size +1).toInt
  val pagefooter =((max(1,page-10) to page) toList) ::: ((page+1 to min(page+10,pageNum)) toList)
}