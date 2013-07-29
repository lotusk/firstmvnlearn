import worksheets.week5.Sort

object test {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet

    Sort.msort(List(1, 5, 6, 77, 33, 121, 2, 5, 8))
                                                  //> res0: List[Int] = List(1, 2, 5, 5, 6, 8, 33, 77, 121)

    val xs = List(1, 5, 6, 77, 33, 121, 2, 5, 8)  //> xs  : List[Int] = List(1, 5, 6, 77, 33, 121, 2, 5, 8)
    xs splitAt 3                                  //> res1: (List[Int], List[Int]) = (List(1, 5, 6),List(77, 33, 121, 2, 5, 8))

    val pair = ("abc", 2)                         //> pair  : (java.lang.String, Int) = (abc,2)
    val (lable, value) = pair                     //> lable  : java.lang.String = abc
                                                  //| value  : Int = 2
   // Thread.`yield`()
   

}