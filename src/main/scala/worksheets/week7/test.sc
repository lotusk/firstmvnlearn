package worksheets.week7

object test {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	((1000 to 10000).toStream)(1)             //> res0: Int = 1001

	Stream.from(1, 1000)                      //> res1: scala.collection.immutable.Stream[Int] = Stream(1, ?)

	def expr = {
		val x = { print("x"); 1 }
		lazy val y = { print("y"); 2 }
		def z = { print("z"); 3 }
		z + y + x + z + y + z
	}                                         //> expr: => Int

	val test = List(1, 2, 3, 4)               //> test  : List[Int] = List(1, 2, 3, 4)
	
	
	(test foldRight 5) { (a, b) => println(a + " " + b); a + b }
                                                  //> 4 5
                                                  //| 3 9
                                                  //| 2 12
                                                  //| 1 14
                                                  //| res2: Int = 15
            
                   
                   
      
}