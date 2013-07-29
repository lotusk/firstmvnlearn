//package com.lotus.scala.mongo
//import com.mongodb.casbah.commons.Imports._
//import com.mongodb.casbah.commons.conversions._
//import com.mongodb.casbah.commons.conversions.scala.RegisterConversionHelpers
//import com.mongodb.casbah.MongoConnection
//import com.mongodb.casbah.commons.conversions.scala.DeregisterJodaTimeConversionHelpers
//
//object mongotest2 extends App {
//    DeregisterJodaTimeConversionHelpers()
//    RegisterConversionHelpers()
//    // Connect to default - localhost, 27017
//    val mongoConn = MongoConnection()
//    val mongoColl = mongoConn("foobar")("bar")
//
//    val start = System.currentTimeMillis()
//    for (i <- 0 to 1000000) {
//        mongoColl += MongoDBObject("user" -> ("myname" + i),
//            "email" -> "~~brendan~~<AT>10genDOTcom","age"->i)
//    }
//    val end = System.currentTimeMillis()
//    println("during time " + (end - start) + " milis")
//    // mongoConn: com.mongodb.casbah.MongoConnection
//
//}