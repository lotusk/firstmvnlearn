package com.lotus.scala

import scala.io.Source
object Temp extends App {
        val name="/home/lucifer/temp/configs.txt"
        for( line <- Source.fromFile(name).getLines()){
              val l=  line.substring(line.indexOf("ParserConfig(")+"ParserConfig(".length()).dropRight(3).replaceAll("\"", "")
              val t=l.split(",")
              println("<config type=\""+t(0)+"\" name=\""+t(2)+"\">"+t(1)+"</config>")
        }
}