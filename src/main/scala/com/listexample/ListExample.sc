package com.listexample

object ListExample {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
                                                  //> fruit  : List[String] = List(apples, oranges, pears)
	val nums = 1 :: (2 :: (3 :: (4 :: Nil)))  //> nums  : List[Int] = List(1, 2, 3, 4)
	val diag3 = (1 :: (0 :: (0 :: Nil))) ::
		(0 :: (1 :: (0 :: Nil))) ::
		(0 :: (0 :: (1 :: Nil))) :: Nil   //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 
	val empty = Nil                           //> empty  : scala.collection.immutable.Nil.type = List()
	val a :: b :: rest = fruit                //> a  : String = apples
                                                  //| b  : String = oranges
                                                  //| rest  : List[String] = List(pears)

	List(1, 2) ::: List(3, 4, 5)              //> res0: List[Int] = List(1, 2, 3, 4, 5)
	List(1, 2) ++ List(3, 4, 5)               //> res1: List[Int] = List(1, 2, 3, 4, 5)
	List() ::: List(1, 2, 3)                  //> res2: List[Int] = List(1, 2, 3)
	List(1, 2, 3) ::: List(4)                 //> res3: List[Int] = List(1, 2, 3, 4)

}