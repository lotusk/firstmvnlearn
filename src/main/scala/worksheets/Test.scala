package worksheets

import scala.io.Source

object Test extends App{
	val str=Source.fromFile("/home/lucifer/test.sql").toIterable
	str.foreach(f=>println(f+":"+f.toInt))
	  123 to 1234
}