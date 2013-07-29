package worksheets
/**
*The only exception to the erasure rule is arrays, because they are handled
*specially in Java as well as in Scala. The element type of an array is stored
*with the array value, so you can pattern match on it. Here’s an example:
**/


object list {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	def tupleDemo(expr: Any) =
		expr match {
			case (a, b, c) =>
				println("matched " + a + b + c)
			case _ =>
		}                                 //> tupleDemo: (expr: Any)Unit

	def generalSize(x: Any) = x match {
		case s: String => s.length
		case m: Map[_, _] => m.size
		case _ => -1
	}                                         //> generalSize: (x: Any)Int
	val expr = 0 :: 1 :: 3 :: 1 :: Nil        //> expr  : List[Int] = List(0, 1, 3, 1)
	expr match {
		case List(0, _*) => println("found it")
		case _ =>
	}                                         //> found it

	def isStringArray(x: Any) = x match {
		case a: Array[String] => "yes"
		case _ => "no"
	}                                         //> isStringArray: (x: Any)String

	val teststr = "name,value"                //> teststr  : String = name,value
	val Array(_, value) = teststr.split(",")  //> value  : String = value
	tupleDemo((1, 2, "a", 4))

	generalSize("abc")                        //> res0: Int = 3
	val mymap: Map[Int, String] = Map(1 -> "abc")
                                                  //> mymap  : Map[Int,String] = Map(1 -> abc)
	generalSize(mymap)                        //> res1: Int = 1
  isStringArray(Array("abc"))                     //> res2: String = yes
  isStringArray(Array(1, 2, 3)  )                 //> res3: String = no
  
}