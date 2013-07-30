import com.listexample.MergeSort
val a = List(1, 2, 3)
List(1, 2) ::: List(3, 4, 5)
List(1, 2, 3).length
val abcde = List('a', 'b', 'c', 'd', 'e')
abcde.last
abcde.init
abcde.reverse
abcde
abcde take 2
abcde drop 2
abcde splitAt 2
abcde apply 2
abcde(2)
abcde.indices


List(List(1, 2), List(3), List(), List(4, 5)).flatten
abcde.indices zip abcde


val zipped = abcde zip List(1, 2, 3)
abcde.zipWithIndex


zipped.unzip


abcde mkString("[", ",", "]")
//abcde addString (buf, "(", ";", ")")
val arr = abcde.toArray
arr.toList
val arr2 = new Array[Int](10)
List(1, 2, 3) copyToArray(arr2, 3)
arr2
val it = abcde.iterator
it.next
it.next
MergeSort.msort((x: Int, y: Int) => x < y)(List(5, 7, 1, 3))

MergeSort.msort[Char](_ > _)(abcde)

MergeSort.msortSwapped(abcde)(_ > _)
val intSort = MergeSort.msort((x: Int, y: Int) => x < y) _
val reverseIntSort = MergeSort.msort((x: Int, y: Int) => x > y) _
val mixedInts = List(4, 1, 9, 0, 5, 8, 3, 6, 2, 7)
intSort(mixedInts)
reverseIntSort(mixedInts)
val words = List("the", "quick", "brown", "fox")
words map (_.toList)


val word = "the big bang theory"
word.toList


words flatMap (_.toList)






List.range(1, 5) flatMap (
  i => List.range(1, i) map (j => (i, j))
  )


for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)



var sum = 0
List(1, 2, 3, 4, 5) foreach (sum += _)

sum
List(1, 2, 3, 4, 5) filter (_ % 2 == 0)
words filter (_.length == 3)

List(1, 2, 3, 4, 5) partition (_ % 2 == 0)
List(1, 2, 3, 4, 5) find (_ % 2 == 0)
List(1, 2, 3, 4, 5) find (_ <= 0)

List(1, 2, 3, -4, 5) takeWhile (_ > 0)
words dropWhile (_ startsWith "t")
val words2 = List("the","there","quick","test", "brown", "fox")



words2 dropWhile (_ startsWith "t")

List(1, 2, 3, -4, 5) span (_ > 0)
def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
def product(xs: List[Int]): Int = (1 /: xs) (_ * _)
("" /: words) (_ +" "+ _)
(words.head /: words.tail)(_ +" "+ _)

def flattenRight[T](xss: List[List[T]]) =(xss :\ List[T]()) (_ ::: _)

def reverseLeft[T](xs: List[T]) =(List[T]() /: xs) {(ys, y) => y :: ys}

reverseLeft(List(1,2,3,4,7))
List(1, -3, 4, 2, 6) sortWith (_ < _)
words sortWith (_.length > _.length)
List.fill(5)('a')
List.fill(3)("hello")
List.fill(2, 3)('b')








scala.util.Random.shuffle(List(1,2,3,5,6,7))

val squares = List.tabulate(5)(n => n * n)
val multiplication = List.tabulate(5,5)(_ * _)





List.concat(List('a', 'b'), List('c'))

def test(a:Int*)={
  a.foreach(println(_))
  println(a.getClass)
}
test(1,3,4)





















