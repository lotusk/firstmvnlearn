import worksheets.week4._

object nth {
    def nth[T](n: Int, xs: worksheets.week4.List[T]): T =
    		if(xs.isEmpty) throw new IndexOutOfBoundsException
    		else if(n==0) xs.head
    		else nth(n-1, xs.tail)            //> nth: [T](n: Int, xs: worksheets.week4.List[T])T
    		
    val list=new Cons(1,new Cons(2,new Cons(3,new Nil)))
                                                  //> list  : worksheets.week4.Cons[Int] = worksheets.week4.Cons@1ff7a1e
    
    nth(2, list)                                  //> res0: Int = 3
    nth(4, list)                                  //> java.lang.IndexOutOfBoundsException
                                                  //| 	at nth$$anonfun$main$1.nth$1(nth.scala:5)
                                                  //| 	at nth$$anonfun$main$1.apply$mcV$sp(nth.scala:12)
                                                  //| 	at scala.runtime.WorksheetSupport$$anonfun$$execute$1.apply$mcV$sp(Works
                                                  //| heetSupport.scala:75)
                                                  //| 	at scala.runtime.WorksheetSupport$.redirected(WorksheetSupport.scala:64)
                                                  //| 
                                                  //| 	at scala.runtime.WorksheetSupport$.$execute(WorksheetSupport.scala:74)
                                                  //| 	at nth$.main(nth.scala:3)
                                                  //| 	at nth.main(nth.scala)
}