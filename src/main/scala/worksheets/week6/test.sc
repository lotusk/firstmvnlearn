package worksheets.week6

object test {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	val xs = Array(1, 2, 3, 44)               //> xs  : Array[Int] = Array(1, 2, 3, 44)
	xs map (x => x * 2)                       //> res0: Array[Int] = Array(2, 4, 6, 88)

	val s = "Hello World"                     //> s  : java.lang.String = Hello World
	s filter (c => c.isUpper)                 //> res1: String = HW
	s.exists(c => c.isUpper)                  //> res2: Boolean = true
	s.forall(c => c.isUpper)                  //> res3: Boolean = false
	val pair = List(1, 2, 3) zip s            //> pair  : List[(Int, Char)] = List((1,H), (2,e), (3,l))

	pair unzip                                //> res4: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))

	s flatMap (c => List('.', c))             //> res5: String = .H.e.l.l.o. .W.o.r.l.d

	xs.sum                                    //> res6: Int = 50
	s.sum                                     //> res7: Char = М
	xs.max                                    //> res8: Int = 44
	s.max                                     //> res9: Char = r

	def scalaProduct(xs: Vector[Double], ys: Vector[Double]): Double = {
		(xs zip ys).map({ case (x, y) => x * y }).sum
	}                                         //> scalaProduct: (xs: Vector[Double], ys: Vector[Double])Double

	val dxs = Vector(1D, 2D)                  //> dxs  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0)
	val dys = Vector(3D, 4D)                  //> dys  : scala.collection.immutable.Vector[Double] = Vector(3.0, 4.0)

	scalaProduct(dxs, dys)                    //> res10: Double = 11.0

	val map = Map(1 -> List(1, 2), 2 -> List(4, 3))
                                                  //> map  : scala.collection.immutable.Map[Int,List[Int]] = Map(1 -> List(1, 2), 
                                                  //| 2 -> List(4, 3))
	map.get(1).get                            //> res11: List[Int] = List(1, 2)

	for {
		i <- map.getOrElse(3, List(Nil))
		j <- 4 to 6
	} yield i + "" + j                        //> res12: List[java.lang.String] = List(List()4, List()5, List()6)

	val test=Some(map)                        //> test  : Some[scala.collection.immutable.Map[Int,List[Int]]] = Some(Map(1 -> 
                                                  //| List(1, 2), 2 -> List(4, 3)))
                                                  
                                                  test.get.get(1)
                                                  //> res13: Option[List[Int]] = Some(List(1, 2))
}