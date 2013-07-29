package com.mymatch

object test {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	val v = Var("x")                          //> v  : com.mymatch.Var = Var(x)
	val op = BinOp("+", Number(1), v)         //> op  : com.mymatch.BinOp = BinOp(+,Number(1.0),Var(x))
	v.name                                    //> res0: String = x
	op.left                                   //> res1: com.mymatch.Expr = Number(1.0)
	op.right == Var("x")                      //> res2: Boolean = true
	op.copy(operator = "-")                   //> res3: com.mymatch.BinOp = BinOp(-,Number(1.0),Var(x))

	import math.{ Pi, E }
	E match {
		case Pi => "strange math? Pi = " + Pi
		case _ => "OK"
	}                                         //> res4: String = OK

	val pi = Pi                               //> pi  : Double = 3.141592653589793
	E match {
		case `pi` => "strange math? Pi = " + pi
		case _ => "OK"
	}                                         //> res5: String = OK

	val expr = BinOp("+", Number(4), Number(0))
                                                  //> expr  : com.mymatch.BinOp = BinOp(+,Number(4.0),Number(0.0))
	expr match {
		case BinOp("+", e, Number(0)) => println("a deep match" + e)
		case _ => println("hihi")
	}                                         //> a deep matchNumber(4.0)

  val myexpr=UnOp("abs",UnOp("abs",Number(0)))    //> myexpr  : com.mymatch.UnOp = UnOp(abs,UnOp(abs,Number(0.0)))
	myexpr match {
		case UnOp("abs", e @ UnOp("abs", _)) => e
		case _ =>
	}                                         //> res6: Any = UnOp(abs,Number(0.0))
	
	
	val l1=List("a","b")                      //> l1  : List[String] = List(a, b)
	val l2:List[Object]=l1                    //> l2  : List[Object] = List(a, b)

}