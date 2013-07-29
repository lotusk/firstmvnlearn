object listfun2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
     def mapFun[T,U](xs:List[T],f:T=>U):List[U]=(xs foldRight List[U]())(f(_)::_)
                                                  //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
    val ll=List(1,3,4,56,6,3)                     //> ll  : List[Int] = List(1, 3, 4, 56, 6, 3)
  //  def f(x:Int):String="_"+x
    mapFun(ll,(a:Int)=>"_"+a)                     //> res0: List[java.lang.String] = List(_1, _3, _4, _56, _6, _3)
    
    val a="heelolllx"                             //> a  : java.lang.String = heelolllx
    a take 4                                      //> res1: String = heel
}