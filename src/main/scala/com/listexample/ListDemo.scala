package com.listexample

/**
 * Created with IntelliJ IDEA.
 * User: lucifer
 * Date: 13-7-29
 * Time: 下午9:06
 * To change this template use File | Settings | File Templates.
 */
object ListDemo {
  def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
  def product(xs: List[Int]): Int = (1 /: xs) (_ * _)


  def main(args: Array[String]) {
    println(ListDemo.sum(List(1,3,9,11)))
    println(ListDemo.product(List(3,7,32)))
  }
}
