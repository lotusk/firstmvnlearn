package com.listexample

object isort {
	def isort(xs: List[Int]): List[Int] =
		if (xs.isEmpty) Nil
		else insert(xs.head, isort(xs.tail))
                                                  //> isort: (xs: List[Int])List[Int]
	def insert(x: Int, xs: List[Int]): List[Int] =
		if (xs.isEmpty || x <= xs.head) x :: xs
		else xs.head :: insert(x, xs.tail)//> insert: (x: Int, xs: List[Int])List[Int]

	isort(List(3, 4, 5, 1, 0, 49, 9, 2))      //> res0: List[Int] = List(0, 1, 2, 3, 4, 5, 9, 49)

	val a :: b :: Nil = List(1, 2)            //> a  : Int = 1
                                                  //| b  : Int = 2
}