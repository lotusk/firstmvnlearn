package worksheets.week7

object StreamApp extends App {
	val stest = Stream.from(0) //> stest  : scala.collection.immutable.Stream[Int] = Stream(0, ?)
	val btest = for {
		a <- stest
		i <- 1 to 10
		if a > 0
	} yield a + " " + i //> btest  : scala.collection.immutable.Stream[java.lang.String] = Stream(100000
	//|  1, ?)

	println(btest.take(3).toList)
	
	println(stest.take(1000).toList)

}