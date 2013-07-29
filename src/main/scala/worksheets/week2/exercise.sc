object exercise {
 	def factorial(n:Int):Int={
 		def loop(acc:Int,n:Int):Int=	if(n==0) acc			else loop(acc*n,n-1)
 		loop(1,n)
 	}                                         //> factorial: (n: Int)Int

	factorial(4)                              //> res0: Int = 24
	
	def sum(f:Int=>Int,a:Int,b:Int)={
		def loop(a:Int,acc:Int):Int={
			if (a>b) acc
			else loop(a+1,f(a)+acc)
		}
		loop(a,0)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	sum(x=>x*x,3,5)                           //> res1: Int = 50
}