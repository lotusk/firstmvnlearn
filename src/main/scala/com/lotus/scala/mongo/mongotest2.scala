//package com.lotus.scala.mongo
//import com.mongodb.casbah.commons.Imports._
//import com.mongodb.casbah.commons.conversions._
//import com.mongodb.casbah.commons.conversions.scala.RegisterConversionHelpers
//import com.mongodb.casbah.MongoConnection
//import com.mongodb.casbah.commons.conversions.scala.DeregisterJodaTimeConversionHelpers
//
//object mongoquerytest extends App {
//    DeregisterJodaTimeConversionHelpers()
//    RegisterConversionHelpers()
//    // Connect to default - localhost, 27017
//    val mongoConn = MongoConnection()
//    val mongoColl = mongoConn("foobar")("bar")
//   
//    for(x<-mongoColl) println(x)
//    // mongoConn: com.mongodb.casbah.MongoConnection
//
//}