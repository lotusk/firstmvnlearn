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


buf +=:3


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
