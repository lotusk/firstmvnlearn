package com.neophyte

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-3
 * Time: 下午10:13
 *
 */

import scala.concurrent.future
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random
import java.util.concurrent.TimeUnit
import sun.util.TimeZoneNameUtility

object FutureThird {
  def main(args: Array[String]) {

      val list=List(1000,2000,3000)

      com.TimeUtils.time{
        val t=list.flatMap(x=>getWordsThree(x))
        println(t)
      }

    com.TimeUtils.time{
      val t=list.par.flatMap(x=>getWordsThree(x))
      println(t)
    }



  }


  def getWords(name: String) = future {
    println(s"start get words $name")
    Thread.sleep(Random.nextInt(2000))
    List(name)
  }


  def getWordsTwo(name: String) ={
    println(s"start get words $name")
    Thread.sleep(Random.nextInt(2000))
    println(s"over :$name")
    List(name)
  }


  def getWordsThree(sleep: Int) ={
    println(s"start get words sleep $sleep")
    Thread.sleep(sleep)
    println(s"over :$sleep")
    List(sleep.toString)
  }
}
