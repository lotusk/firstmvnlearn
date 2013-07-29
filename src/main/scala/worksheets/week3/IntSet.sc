package worksheets.week3

object IntSet {
    val t1=new NonEmpty(3,new Empty,new Empty)    //> t1  : worksheets.week3.NonEmpty = {.3.}
    val t2=t1 incl 4                              //> t2  : worksheets.week3.IntSet = {.3{.4.}}
}

abstract class IntSet {
    def incl(x: Int): IntSet
    def contain(x: Int): Boolean
    def union(other:IntSet):IntSet
}

class Empty extends IntSet {
    def contain(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
    override def toString="."
    def union(other:IntSet):IntSet=other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    def contain(x: Int): Boolean =
        if (x < elem) left contain x
        else if (x > elem) right contain x
        else true
    def incl(x: Int): IntSet =
        if (x < elem) new NonEmpty(elem,left incl x,right)
        else if (x > elem) new NonEmpty(elem,left,right incl x)
        else this
        
      override def toString="{"+left+elem+right+"}"
      
      def union(other:IntSet):IntSet=
      	((left union right) union other) incl elem
}