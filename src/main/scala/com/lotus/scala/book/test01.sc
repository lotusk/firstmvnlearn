package com.lotus.scala.book

object test01 {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	val n = 2                                 //> n  : Int = 2
	val half =
		if (n % 2 == 0)
			n / 2
		else
			throw new RuntimeException("n must be even")
                                                  //> half  : Int = 1

	def f(): Int = try { return 1 } finally { return 2 }
                                                  //> f: ()Int
	def g(): Int = try { 1 } finally { 2 }    //> g: ()Int

	f                                         //> res0: Int = 2

	g                                         //> res1: Int = 1

	val a = 1;                                //> a  : Int = 1
	{
		val a = 2 // Co
		println(a)
	}                                         //> 2
	println(a)                                //> 1
	
	val abc=123.3545555                       //> abc  : Double = 123.3545555
	"%.3f".format(abc)                        //> res2: String = 123.355
	
	val text="a quick task will be silly yell mail and email"
                                                  //> text  : java.lang.String = a quick task will be silly yell mail and email
                                                  
    def countWords(str:String,content:String):Int={
    		val reg=str.r
    		reg.findAllIn(content).size
    }                                             //> countWords: (str: String, content: String)Int
    
    countWords("mail", text)                      //> res3: Int = 2
}