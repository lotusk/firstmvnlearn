package com.lotus.scala

class ScaRational (x:Int,y:Int){
	require(y!=0,"denomintor must be nonzero")
	
	def this(x:Int)=this(x,1)
	
	private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
	private val g=gcd(x,y)
	def numer=x/g
	def denom=y/g
	
	def less(that:ScaRational)=numer*that.denom<that.numer*denom
	
	def max(that:ScaRational)=if(less(that)) that else this
	def add(that:ScaRational)={
		new ScaRational(that.numer*denom+that.denom*numer,denom*that.denom)
	}
	
	def neg=new ScaRational(-numer,denom)
	
	def sub(that:ScaRational)=add(that.neg)
	
	override def toString = numer+"/"+denom
}