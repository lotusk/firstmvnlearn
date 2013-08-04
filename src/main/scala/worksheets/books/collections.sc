/**
 * Created with IntelliJ IDEA.
 * User: lucifer
 * Date: 13-7-30
 * Time: 下午9:16
 * To change this template use File | Settings | File Templates.
 */

import scala.collection.mutable.ListBuffer
val buf = new ListBuffer[Int]













buf += 1
buf += 2
buf




buf



buf.toList
import scala.collection.mutable.ArrayBuffer
val buf2 = new ArrayBuffer[Int]()



buf2 += 12
buf2 += 15
buf2



buf2.length
buf2(0)
buf2.toArray
def hasUpperCase(s: String) = s.exists(_.isUpper)
hasUpperCase("Robert Frost")
hasUpperCase("e e cummings")
import scala.collection.mutable
val mutaSet = mutable.Set(1, 2, 3)
val text = "See Spot run. Run, Spot. Run!"
val wordsArray = text.split("[ !,.]+")



val words = mutable.Set.empty[String]
for (word <- wordsArray)
  words += word.toLowerCase

words



words + "mytest"



words



words += "test02"
words




val nums = Set(1, 2, 3)
nums + 5





nums -3
nums ++ List(6,7)




nums -- List(1, 2)
nums & Set(1, 3, 5, 7)

val map = mutable.Map.empty[String, Int]
map("hello") = 1
map



map("hello")

import scala.collection.immutable.TreeSet
val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)


import scala.collection.immutable.TreeMap
val cs = TreeSet('f', 'u', 'n')


var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')


tm += (2 -> 'x')
tm









