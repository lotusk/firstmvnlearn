//package com.lotus.scala.mysql
//import com.twitter.querulous.evaluator.QueryEvaluator
//
//object mysqltest extends App {
//    val queryEvaluator = QueryEvaluator("127.0.0.1", "test","root", "thabkc")
//
//    val users = queryEvaluator.select("SELECT * FROM t_user WHERE id IN (?)", List(1, 2, 3)) { row =>
//     	(row.getInt("id"), row.getString("name"))
//    }
//    
//    users.foreach(println)
////    queryEvaluator.execute("insert into t_user(name,age) VALUES (?, ?)",  "Linked",22)
//}