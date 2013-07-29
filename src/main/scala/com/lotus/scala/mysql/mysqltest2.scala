//package com.lotus.scala.mysql
//import com.twitter.querulous.evaluator.QueryEvaluator
//
//object mysqltest2 extends App {
//    val queryEvaluator = QueryEvaluator("127.0.0.1", "test", "root", "thabkc")
//    val start = System.currentTimeMillis()
//       queryEvaluator.executeBatch("insert into t_user(name,age) VALUES (?, ?)") { f =>
//        	for (j <- 0 to 10000)
//        		f("name"+j,j)
//        }
//    val end = System.currentTimeMillis()
//    println("during time " + (end - start) + " milis")
//}