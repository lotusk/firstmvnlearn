package com

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-3
 * Time: 下午11:48
 *
 */

object TimeUtils {

  def time[A](f: => A, desc: String*): A = {
    val start = System.nanoTime()
    val result = f
    val end = System.nanoTime()
    println(f"${desc.mkString("->")} completed in ${(end - start) / 1000000.0}%.3f ms")
    result
  }

}
