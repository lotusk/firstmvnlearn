//package com.lotus.scala.mysql
//import com.twitter.querulous.evaluator.QueryEvaluator
//
//object mysqltest3 extends App {
//    val queryEvaluator = QueryEvaluator("127.0.0.1", "test","root", "thabkc")
//
//    val start=System.currentTimeMillis()
//    for (i <- 0 to 1000000)
//    	queryEvaluator.execute("insert into t_user(name,age) VALUES (?, ?)",  "name"+i,i)
//    val end=System.currentTimeMillis()
//    println("during time "+(end-start)+" milis")
//}