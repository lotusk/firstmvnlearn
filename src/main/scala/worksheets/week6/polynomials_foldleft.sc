package worksheets.week6

object polynomials_foldleft {
  class Poly(val terms0:Map[Int,Double]){
  def this(bindings:(Int,Double)*)=this(bindings.toMap)
  
    val terms=terms0 withDefaultValue(0.0)
    def +(other:Poly)=new Poly(terms ++ ((other.terms foldLeft terms)(addTerm)))
    
    def addTerm(terms:Map[Int,Double],term:(Int,Double)):Map[Int,Double]={
      val (exp,coeff)=term
      terms + (exp -> (coeff+terms(exp)))
    }
    
    override def toString=
      (for((exp,coeff) <- terms.toList.sorted.reverse) yield coeff+"x^"+exp) mkString " + "
  }
  
  val p1=new Poly(Map(1->2.0,3->4.0,5->6.2))      //> p1  : worksheets.week6.polynomials_foldleft.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
  
  val p2=new Poly(0->3.0,3->7.0)                  //> p2  : worksheets.week6.polynomials_foldleft.Poly = 7.0x^3 + 3.0x^0
  
  p1 + p2                                         //> res0: worksheets.week6.polynomials_foldleft.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1
                                                  //|  + 3.0x^0
  
  p2 + p1                                         //> res1: worksheets.week6.polynomials_foldleft.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1
                                                  //|  + 3.0x^0
   p1.terms(7)                                    //> res2: Double = 0.0
}