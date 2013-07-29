package com.listexample

object isort2 {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	def isort(xs: List[Int]): List[Int] = xs match {
		case List() => List()
		case x :: xs1 => insert(x, isort(xs1))
	}                                         //> isort: (xs: List[Int])List[Int]
	def insert(x: Int, xs: List[Int]): List[Int] = xs match {
		case List() => List(x)
		case y :: ys => if (x <= y) x :: xs
		else y :: insert(x, ys)
	}                                         //> insert: (x: Int, xs: List[Int])List[Int]
}