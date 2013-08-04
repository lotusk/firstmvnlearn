package com.lotus.scala

import java.io.{FileInputStream, BufferedInputStream, FileReader, BufferedReader}
import scala.io.Source

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-1
 * Time: 上午10:29
 *
 */
object ReaderTest {
  def main(args: Array[String]) {
    val br=new BufferedInputStream(new FileInputStream("/home/lucifer/baidu.seed"))
    val line=Source.fromInputStream(br).getLines()
    line.foreach(println(_))
    println("br1"+br.available())
    br.close()
    println("br2"+br.available())
  }
}
