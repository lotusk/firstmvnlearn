object listfun3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
     def mapFun[T,U](xs:List[T])(implicit f:T=>U):List[U]=(xs foldRight List[U]())(f(_)::_)
                                                  //> mapFun: [T, U](xs: List[T])(implicit f: T => U)List[U]
    val ll=List(1,3,4,56,6,3)                     //> ll  : List[Int] = List(1, 3, 4, 56, 6, 3)
  //  def f(x:Int):String="_"+x
    mapFun(ll)((a:Int)=>a*a)                      //> res0: List[Int] = List(1, 9, 16, 3136, 36, 9)
}