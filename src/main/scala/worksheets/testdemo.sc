package worksheets

object testdemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val test:Base=new A(2)                          //> test  : worksheets.Base = A(2)
  
  val t=test match {
   	case A(i)=>
   		println("a")
   		i
   	case B(i) if i==2=>println("b")
   		println("b"+i)
   		i
  }                                               //> a
                                                  //| t  : Any = 2
            val name="yunbiao"                    //> name  : String = yunbiao
            val a=s"hello ${name}"                //> a  : String = hello yunbiao
  
  
  val list =List(1,3,4,5,6,9)                     //> list  : List[Int] = List(1, 3, 4, 5, 6, 9)
  list.foldLeft(0){
  (r,c) => r+c
  }                                               //> res0: Int = 28
  
  val list2=List()                                //> list2  : List[Nothing] = List()
  
 val map =Map("a"->1,"b"->2)                      //> map  : scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2)
 
  list match {
     case Nil=> println("empty")
     case 1::_ =>println("head is 1")
     case _ =>
  }                                               //> head is 1
  
  Some(1,2,3)                                     //> res1: Some[(Int, Int, Int)] = Some((1,2,3))
}

class Base

case class A(val a:Int) extends Base
case class B(val a:String) extends Base