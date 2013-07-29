object rationals {
    val x = new Rational(1, 3)                    //> x  : Rational = 1/3
    x.numer                                       //> res0: Int = 1

    val y = new Rational(5, 7)                    //> y  : Rational = 5/7
    val z = new Rational(3, 2)                    //> z  : Rational = 3/2
    x + y                                         //> res1: Rational = 22/21
    x - y - z                                     //> res2: Rational = -79/42
    y + y                                         //> res3: Rational = 10/7

    x < y                                         //> res4: Boolean = true
    x max y                                       //> res5: Rational = 5/7

    new Rational(2)                               //> res6: Rational = 2/1
    //	val strange=new Rational(1,0)
    //	strange.add(strange)
}

class Rational(x: Int, y: Int) {
    require(y != 0, "denomintor must be nonzero")

    def this(x: Int) = this(x, 1)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    def numer = x / g
    def denom = y / g

    def <(that: Rational) = numer * that.denom < that.numer * denom

    def max(that: Rational) = if (this < that) that else this
    def +(that: Rational) = {
        new Rational(that.numer * denom + that.denom * numer, denom * that.denom)
    }

    def unary_- :Rational = new Rational(-numer, denom)

    def -(that: Rational) = this + -that

    override def toString = numer + "/" + denom
}