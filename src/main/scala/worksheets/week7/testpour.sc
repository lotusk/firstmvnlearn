package worksheets.week7

object testpour {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	val problem = new Pouring(Vector(4, 9))   //> problem  : worksheets.week7.Pouring = worksheets.week7.Pouring@f01a1e

  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with w
                                                  //| orksheets.week7.testpour.problem.Move] = Vector(Empty(0), Empty(1), Fill(0),
                                                  //|  Fill(1), Pour(0,1), Pour(1,0))
  problem.pathSets.take(3).toList                 //> res1: List[Set[worksheets.week7.testpour.problem.Path]] = List(Set(--> Vecto
                                                  //| r(0, 0)), Set(Fill(0)--> Vector(4, 0), Fill(1)--> Vector(0, 9)), Set(Fill(0)
                                                  //|  Fill(1)--> Vector(4, 9), Fill(0) Pour(0,1)--> Vector(0, 4), Fill(1) Fill(0)
                                                  //| --> Vector(4, 9), Fill(1) Pour(1,0)--> Vector(4, 5)))
                                                  
  problem.solutions(6)                            //> res2: Stream[worksheets.week7.testpour.problem.Path] = Stream(Fill(1) Pour(1
                                                  //| ,0) Empty(0) Pour(1,0) Empty(0) Pour(1,0) Fill(1) Pour(1,0)--> Vector(4, 6),
                                                  //|  ?)
  
 val stest= Stream.from(0, 1)                     //> stest  : scala.collection.immutable.Stream[Int] = Stream(0, ?)
 
 val btest=for{
    a<-stest
    i<- 1 to 10
    if a> 1000
 }yield a  +" "+ i                                //> btest  : scala.collection.immutable.Stream[java.lang.String] = Stream(1001 1
                                                  //| , ?)
 
 btest.take(3).toList                             //> res3: List[java.lang.String] = List(1001 1, 1001 2, 1001 3)
}