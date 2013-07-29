object lists {
	def issort(xs: List[Int]): List[Int] = xs match{
	   case Nil=>List()
	   case y :: ys=>insert(y,issort(ys))
	}                                         //> issort: (xs: List[Int])List[Int]
	
	def insert(x:Int,xs:List[Int]):List[Int]=xs match {
	   case List()=>x::Nil
     case y :: ys=>if(x<=y) x::xs else y::insert(x,ys)
	}                                         //> insert: (x: Int, xs: List[Int])List[Int]

	issort( 3::1::4::7::6::9::Nil)            //> res0: List[Int] = List(1, 3, 4, 6, 7, 9)
	
	val a= 1::2::3::Nil                       //> a  : List[Int] = List(1, 2, 3)
	val b=3::4::5::Nil                        //> b  : List[Int] = List(3, 4, 5)
	a++b                                      //> res1: List[Int] = List(1, 2, 3, 3, 4, 5)
	a:::b                                     //> res2: List[Int] = List(1, 2, 3, 3, 4, 5)
	a take 1                                  //> res3: List[Int] = List(1)
	a drop 2                                  //> res4: List[Int] = List(3)
}