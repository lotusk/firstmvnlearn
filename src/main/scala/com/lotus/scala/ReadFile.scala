package com.lotus.scala

import scala.io.Source
object Readfile extends App {
        def widthOfLength(s: String) = s.length.toString.length
        val lines = Source.fromFile(args(0)).getLines().toList
        val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
        val maxWidth = widthOfLength(longestLine)
        for (line <- lines) {
                val numSpaces = maxWidth - widthOfLength(line)
                val padding = " " * numSpaces
                println(padding + line.length + " | " + line)
        }

}