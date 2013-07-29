object listfun {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet
    val nums = List(2, 3, -4, 5, 7, 1)            //> nums  : List[Int] = List(2, 3, -4, 5, 7, 1)
    val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[java.lang.String] = List(apple, pineapple, orange, banana)

    nums filter (x => x > 0)                      //> res0: List[Int] = List(2, 3, 5, 7, 1)
    nums filterNot (x => x > 0)                   //> res1: List[Int] = List(-4)
    nums partition (x => x > 0)                   //> res2: (List[Int], List[Int]) = (List(2, 3, 5, 7, 1),List(-4))

    nums takeWhile (x => x > 0)                   //> res3: List[Int] = List(2, 3)
    nums dropWhile (x => x > 0)                   //> res4: List[Int] = List(-4, 5, 7, 1)
    nums span (x => x > 0)                        //> res5: (List[Int], List[Int]) = (List(2, 3),List(-4, 5, 7, 1))

    def pack[T](xs: List[T]): List[List[T]] = xs match {
        case Nil => Nil
        case x :: xs1 =>
            val (first, rest) = xs span (y => y == x)
            first :: pack(rest)
    }                                             //> pack: [T](xs: List[T])List[List[T]]
    def encode[T](xs: List[T]): List[(T, Int)] = xs match {
        case Nil => Nil
        case x :: xs1 =>
            val (first, rest) = xs span (y => y == x)
            (first.head, first.length) :: encode(rest)
    }                                             //> encode: [T](xs: List[T])List[(T, Int)]

    def encode1[T](xs: List[T]): List[(T, Int)] = pack(xs) map (list => (list.first, list.length))
                                                  //> encode1: [T](xs: List[T])List[(T, Int)]
    val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[java.lang.String] = List(a, a, a, b, c, c, a)
    pack(data)                                    //> res6: List[List[java.lang.String]] = List(List(a, a, a), List(b), List(c, c)
                                                  //| , List(a))
    encode(data)                                  //> res7: List[(java.lang.String, Int)] = List((a,3), (b,1), (c,2), (a,1))
    encode1(data)                                 //> res8: List[(java.lang.String, Int)] = List((a,3), (b,1), (c,2), (a,1))

    def sum(xs: List[Int]): Int = 0 :: xs reduceLeft (_ + _)
                                                  //> sum: (xs: List[Int])Int

    def sum1(xs: List[Int]): Int = (xs foldLeft 0)(_ + _)
                                                  //> sum1: (xs: List[Int])Int
 
    def lengthFun[T](xs: List[T]):Int=(xs foldRight 0)((a,b)=>b+1)
                                                  //> lengthFun: [T](xs: List[T])Int
    


    sum(List(1, 3, 5, 10))                        //> res9: Int = 19
   // sum1(List(1, 3, 5, 10))
   lengthFun(List(1,3,4,56,6,3))                  //> res10: Int = 6
                                                  //| Output exceeds cutoff limit. 
    sum(List(3))

    sum(List())

    sum1(List(0))

}