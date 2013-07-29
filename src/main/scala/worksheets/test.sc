package worksheets

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def testRandom= {
         var r = new scala.util.Random
         val a=1 to 100 map { _ => r.nextInt(100) }
         println(a mkString "\n")
    }                                             //> testRandom: => Unit
    
    var r = new scala.util.Random                 //> r  : scala.util.Random = scala.util.Random@4d892c59
     val a=1 to 100 map { _ => r.nextInt(100) }   //> a  : scala.collection.immutable.IndexedSeq[Int] = Vector(57, 48, 6, 17, 37, 
                                                  //| 0, 21, 9, 15, 11, 52, 91, 19, 51, 15, 48, 56, 53, 59, 22, 32, 20, 81, 16, 94
                                                  //| , 62, 14, 55, 95, 64, 2, 10, 51, 53, 62, 36, 8, 15, 18, 64, 49, 74, 71, 67, 
                                                  //| 12, 14, 35, 74, 0, 8, 91, 39, 98, 82, 30, 81, 0, 64, 96, 13, 43, 34, 0, 20, 
                                                  //| 26, 67, 56, 67, 43, 76, 64, 94, 44, 27, 58, 72, 74, 12, 85, 17, 44, 65, 47, 
                                                  //| 58, 71, 67, 93, 30, 51, 64, 59, 33, 17, 8, 58, 49, 55, 49, 48, 42)
       //  println(a mkString "\n")
    
    
    val t="abcd"                                  //> t  : String = abcd
    
    "6" match{
    	case t if t==6.toString() =>println("ttttttttt")
    }                                             //> ttttttttt
    
    
    val list=List(1,2,3,45)                       //> list  : List[Int] = List(1, 2, 3, 45)
    val l2=list map {_*2}                         //> l2  : List[Int] = List(2, 4, 6, 90)
    l2 zip list                                   //> res0: List[(Int, Int)] = List((2,1), (4,2), (6,3), (90,45))
    
    val teststr="name,value"                      //> teststr  : String = name,value
    val Array(_,value)=teststr.split(",")         //> value  : String = value
    println(value)                                //> value
    
    
}