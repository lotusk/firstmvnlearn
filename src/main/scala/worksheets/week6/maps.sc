package worksheets.week6

object maps {
	val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[java.lang.String,Int] = Map(I
                                                  //|  -> 1, V -> 5, X -> 10)
	val capital = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capital  : scala.collection.immutable.Map[java.lang.String,java.lang.String]
                                                  //|  = Map(US -> Washington, Switzerland -> Bern)
	val testplus = Map("US" -> "abc", "test" -> "test")
                                                  //> testplus  : scala.collection.immutable.Map[java.lang.String,java.lang.String
                                                  //| ] = Map(US -> abc, test -> test)

	capital ++ testplus                       //> res0: scala.collection.immutable.Map[java.lang.String,java.lang.String] = Ma
                                                  //| p(US -> abc, Switzerland -> Bern, test -> test)
	capital("US")                             //> res1: java.lang.String = Washington
	//capital("andorra")

	capital get "andorra"                     //> res2: Option[java.lang.String] = None
	capital get "US"                          //> res3: Option[java.lang.String] = Some(Washington)

	def showCapital(country: String) = capital.get(country) match {
		case Some(capital) => capital
		case None => "missing data"
	}                                         //> showCapital: (country: String)java.lang.String

	showCapital("US")                         //> res4: java.lang.String = Washington
	showCapital("andorra")                    //> res5: java.lang.String = missing data

	val a = Map(1 -> 2.0)                     //> a  : scala.collection.immutable.Map[Int,Double] = Map(1 -> 2.0)
	val b = Map(1 -> 3.0, 2 -> 1.0)           //> b  : scala.collection.immutable.Map[Int,Double] = Map(1 -> 3.0, 2 -> 1.0)
	a ++ b                                    //> res6: scala.collection.immutable.Map[Int,Double] = Map(1 -> 3.0, 2 -> 1.0)
	def toMap(terms:(Char,Char)*)=terms.toMap //> toMap: (terms: (Char, Char)*)scala.collection.immutable.Map[Char,Char]
	toMap('a' -> 'b', 'a' -> 'c', 'b' -> 'c') //> res7: scala.collection.immutable.Map[Char,Char] = Map(a -> c, b -> c)
	val list = List(('a' -> 'b', 'a' -> 'c', 'b' -> 'c'))
                                                  //> list  : List[((Char, Char), (Char, Char), (Char, Char))] = List(((a,b),(a,c)
                                                  //| ,(b,c)))
	//list.toMap()
}