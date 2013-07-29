package com.mymatch

object test02 {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	val a = Set("a", "b")                     //> a  : scala.collection.immutable.Set[String] = Set(a, b)

	val opGroups =
		Array(
			Set("|", "||"),
			Set("&", "&&"),
			Set("ˆ"),
			Set("==", "!="),
			Set("<", "<=", ">", ">="),
			Set("+", "-"),
			Set("*", "%"))            //> opGroups  : Array[scala.collection.immutable.Set[String]] = Array(Set(|, ||)
                                                  //| , Set(&, &&), Set(ˆ), Set(==, !=), Set(<, <=, >, >=), Set(+, -), Set(*, %))
                                                  //| 
	// A mapping from operators to their precedence
	val precedence = {
		val assocs =
			for {
				i <- 0 until opGroups.length
				op <- opGroups(i)
			} yield op -> i
		assocs.toMap
	}                                         //> precedence  : scala.collection.immutable.Map[String,Int] = Map(* -> 6, <= ->
                                                  //|  4, % -> 6, < -> 4, & -> 1, ˆ -> 2, || -> 0, >= -> 4, | -> 0, - -> 5, == ->
                                                  //|  3, + -> 5, != -> 3, && -> 1, > -> 4)

}