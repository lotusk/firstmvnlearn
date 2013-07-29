package worksheets.week7

object mytest extends App {
	def expr = {
		val x = { print("x"); 1 }
		lazy val y = { print("y"); 2 }
		def z = { print("z"); 3 }
		z + y + x + z + y + z
	}
	expr
	println("--------------")
	expr
	
//	def from(n:Int):Stream[Int]=n #:: from(n+1)
//	val a=from(1000)
//	val m=for {
//		t <- a
//		if t<999
//	}yield t
//	
//	println(m)
	
	val test=List("a",Stream.Empty,"B",Stream.Empty).toStream
	val mm=for{
		a <- test
		if(a=="b")
	}yield a
	println("-----------")
	println(mm.take(3).toList)
}

