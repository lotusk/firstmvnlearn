object lists {
        println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
        val oneTwo = List(1, 2)                   //> oneTwo  : List[Int] = List(1, 2)
        val threeFour = List(3, 4)                //> threeFour  : List[Int] = List(3, 4)
        val oneTwoThreeFour = oneTwo ::: threeFour//> oneTwoThreeFour  : List[Int] = List(1, 2, 3, 4)
        println(oneTwo + " and " + threeFour + " were not mutated.")
                                                  //> List(1, 2) and List(3, 4) were not mutated.
        println("Thus, " + oneTwoThreeFour + " is a new List.")
                                                  //> Thus, List(1, 2, 3, 4) is a new List.

        val twoThree = List(2, 3)                 //> twoThree  : List[Int] = List(2, 3)
        val oneTwoThree = 1 :: twoThree           //> oneTwoThree  : List[Int] = List(1, 2, 3)
        println(oneTwoThree)                      //> List(1, 2, 3)

        val abc = 1 :: 2 :: 3 :: Nil              //> abc  : List[Int] = List(1, 2, 3)
        println(oneTwoThree)                      //> List(1, 2, 3)

        val pair = (99, "Luftballons", 12.5)      //> pair  : (Int, java.lang.String, Double) = (99,Luftballons,12.5)
        println(pair._1)                          //> 99
        println(pair._2)                          //> Luftballons
        pair._3                                   //> res0: Double = 12.5
        //最大22
        var conceptually = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2)
                                                  //> conceptually  : (Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int,
                                                  //|  Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) = (1,2,3,4,5,6,7,8,9,10,1
                                                  //| ,2,3,4,5,6,7,8,9,10,1,2)
}