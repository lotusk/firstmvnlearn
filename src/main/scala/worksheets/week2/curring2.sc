object exercise2 {
  def mapReduce(a: Int, b: Int)(f: Int => Int, combine: (Int, Int) => Int, zero: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(a + 1, b)(f, combine, zero))
                                                  //> mapReduce: (a: Int, b: Int)(f: Int => Int, combine: (Int, Int) => Int, zero:
                                                  //|  Int)Int

  def product(a: Int, b: Int)(f: Int => Int): Int = mapReduce(a, b)(f, (x, y) => x * y, 1)
                                                  //> product: (a: Int, b: Int)(f: Int => Int)Int

  product(3, 7){x => x * x}                       //> res0: Int = 6350400
  product(3, 4)(x => x * x)                       //> res1: Int = 144

//	fact(4)
  def fact(n: Int) =
    product(1, n)(x => x)                         //> fact: (n: Int)Int

  fact(5)                                         //> res2: Int = 120
}