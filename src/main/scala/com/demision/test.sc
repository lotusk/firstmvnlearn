package com.demision
import com.demision.Element._

object test {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	//val test = new ArrayElement(Array())

	//	val ae = new ArrayElement(Array("hello", "world"))
	//	ae.width
	//val e1: Element = new ArrayElement(Array("hello", "worldss"))
	//val ae: ArrayElement = new LineElement("hello")
	//val e2: Element = ae
	//val e3: Element = new UniformElement('x', 2, 3)

	//e3.contents
	
	val test=elem(Array("hello")) above elem(Array("world!"))
                                                  //> test  : com.demision.Element.Element = hello 
                                                  //| world!
                                                  println(test)
                                                  //> hello 
                                                  //| world!
	elem(Array("hello")) beside  elem(Array("world!"))
                                                  //> res0: com.demision.Element.Element = helloworld!
	               
	 val testlist=Array(1,2,3) zip Array(8,7,6)
                                                  //> testlist  : Array[(Int, Int)] = Array((1,8), (2,7), (3,6))
	 
	 testlist foreach{ case (l1,l2)=>
	 println(l1+":"+l2)
	 }                                        //> 1:8
                                                  //| 2:7
                                                  //| 3:6
                 val l2=Nil                       //> l2  : scala.collection.immutable.Nil.type = List()
                 l2 mkString ","                  //> res1: String = ""
                 
                 
                 
                 "a" * 3                          //> res2: String = aaa

}