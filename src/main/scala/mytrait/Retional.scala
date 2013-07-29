package mytrait

/**
 * Created with IntelliJ IDEA.
 * User: lucifer
 * Date: 13-1-21
 * Time: 下午2:30
 * To change this template use File | Settings | File Templates.
 */
class Rational(val numer: Int, val denom: Int) extends Ordered[Rational] {
  // ...
  def compare(that: Rational) =
    (this.numer * that.denom) - (that.numer * this.denom)

}

