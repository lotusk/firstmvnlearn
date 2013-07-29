//package com.lotus.scala.mysql
//import com.twitter.querulous.evaluator.QueryEvaluator
//
//object mysqltest4 extends App {
//    val queryEvaluator = QueryEvaluator("127.0.0.1", "test", "root", "thabkc")
//    val start = System.currentTimeMillis()
//       queryEvaluator.executeBatch("insert into t_user2(id,name,age) VALUES (?, ?,?)") { f =>
//        	for (j <- 0 to 10000)
//        		f(j,"name"+j,j)
//        }
//    val end = System.currentTimeMillis()
//    println("during time " + (end - start) + " milis")
//}