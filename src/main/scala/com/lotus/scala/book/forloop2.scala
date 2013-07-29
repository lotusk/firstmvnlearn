package com.lotus.scala.book

object forloop2 extends App {

	def scalaFiles =
		for {
			file <- filesHere2
			if file.getName.endsWith(".scala")
		} yield file

	val filesHere2 = (new java.io.File("./src/main/scala/com/lotus/scala/book")).listFiles

	def fileLines(file: java.io.File) =
		scala.io.Source.fromFile(file).getLines().toList

	val forLineLengths =
		for {
			file <- filesHere2
			if file.getName.endsWith(".scala")
			line <- fileLines(file)
			trimmed = line.trim
			if trimmed.matches(".*for.*")
		} yield trimmed.length

	println(forLineLengths);
}