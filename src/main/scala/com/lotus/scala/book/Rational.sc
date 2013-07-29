package com.lotus.scala.book
object RationalTest {
        println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
        new Rational(1, 2)                        //> res0: com.lotus.scala.book.Rational = 1/2
        //new Rational(3,0)
        val oneHalf = new Rational(1, 2)          //> oneHalf  : com.lotus.scala.book.Rational = 1/2
        val twoThirds = new Rational(2, 3)        //> twoThirds  : com.lotus.scala.book.Rational = 2/3
        oneHalf + twoThirds                       //> res1: com.lotus.scala.book.Rational = 7/6

        val y = new Rational(3)                   //> y  : com.lotus.scala.book.Rational = 3/1

        val x = new Rational(66, 42)              //> x  : com.lotus.scala.book.Rational = 11/7

        x * y                                     //> res2: com.lotus.scala.book.Rational = 33/7
        x * 2                                     //> res3: com.lotus.scala.book.Rational = 22/7
        //	2 * r


        def gcdLoop(x: Long, y: Long): Long = {
                var a = x
                var b = y
                while (a != 0) {
                        val temp = a
                        a = b % a
                        b = temp
                    }
                b
        }                                         //> gcdLoop: (x: Long, y: Long)Long

}