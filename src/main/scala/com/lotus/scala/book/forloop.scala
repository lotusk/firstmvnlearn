package com.lotus.scala.book

object forloop extends App {
	val filesHere = (new java.io.File(".")).listFiles

	for (file <- filesHere)
		println(file)

	// Not common in Scala...
	for (i <- 0 to filesHere.length - 1)
		println(filesHere(i))

	println("--------------------")
	val filesHere2 = (new java.io.File("./src/main/scala/com/lotus/scala/book")).listFiles
	for (file <- filesHere2 if file.getName.endsWith(".scala"))
		println(file)
	println("--------------------")
	for (
		file <- filesHere2 if file.isFile if file.getName.endsWith(".scala")
	) println(file)

	def fileLines(file: java.io.File) =
		scala.io.Source.fromFile(file).getLines().toList
	def grep(pattern: String) =
		for (
			file <- filesHere2 if file.getName.endsWith(".scala");
			line <- fileLines(file) //if line.trim.matches(pattern)
		) println(file + ": " + line.trim)
	grep(".*gcd.*")

	println("==============================")
	def grep2(pattern: String) =
		for {
			file <- filesHere2
			if file.getName.endsWith(".scala")
			line <- fileLines(file)
			trimmed = line.trim
			if trimmed.matches(pattern)
		} println(file + ": " + trimmed)
	grep2(".*gcd.*")
	
}