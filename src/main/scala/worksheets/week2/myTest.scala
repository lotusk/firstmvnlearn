package worksheets.week2

object myTest extends App {
  printf("hello")
  printf("" + factorial(4))
  println
  println(  product(x => x * x)(3, 7) )
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = if (n == 0) acc else loop(acc * n, n - 1)
    loop(1, n)
  } //> factorial: (n: Int)Int

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

}