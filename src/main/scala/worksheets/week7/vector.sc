package worksheets.week7

object vector {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	val level =
		"""ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin                  //> level  : String = ooo-------
                                                  //| oSoooo----
                                                  //| ooooooooo-
                                                  //| -ooooooooo
                                                  //| -----ooToo
                                                  //| ------ooo-
	val vector: Vector[Vector[Char]] =
		Vector(level.split("\n").map(str => Vector(str: _*)): _*)
                                                  //> vector  : Vector[Vector[Char]] = Vector(Vector(o, o, o, -, -, -, -, -, -, -)
                                                  //| , Vector(o, S, o, o, o, o, -, -, -, -), Vector(o, o, o, o, o, o, o, o, o, -)
                                                  //| , Vector(-, o, o, o, o, o, o, o, o, o), Vector(-, -, -, -, -, o, o, T, o, o)
                                                  //| , Vector(-, -, -, -, -, -, o, o, o, -))

	val str = "abcde"                         //> str  : java.lang.String = abcde
	Vector(str: _*)                           //> res0: scala.collection.immutable.Vector[Char] = Vector(a, b, c, d, e)
}