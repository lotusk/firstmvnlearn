package com.lotus.scala.book

object trycatch extends App {
	import java.io.FileReader
	import java.io.FileNotFoundException
	import java.io.IOException
	try {
		val f = new FileReader("input.txt")
		// Use and close file
	} catch {
		case ex: FileNotFoundException => println("1")
		case ex: IOException => println("2")
	} finally {
		//f.close()
		// Be sure to close the file
	}
}