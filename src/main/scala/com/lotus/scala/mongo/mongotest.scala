//package com.lotus.scala.mongo
//import com.mongodb.casbah.commons.Imports._
//import com.mongodb.casbah.commons.conversions._
//import com.mongodb.casbah.commons.conversions.scala.RegisterConversionHelpers
//import com.mongodb.casbah.MongoConnection
//import com.mongodb.casbah.commons.conversions.scala.DeregisterJodaTimeConversionHelpers
//
//object mongotest extends App {
//    DeregisterJodaTimeConversionHelpers()
//    RegisterConversionHelpers()
//
//    // Connect to default - localhost, 27017
//    val mongoConn = MongoConnection()
//    val mongoDB = mongoConn("foobar")
//    val mongoColl = mongoDB("bar")
//    val user1 = MongoDBObject("user" -> "bwmcadams",
//        "email" -> "~~brendan~~<AT>10genDOTcom")
//    val user2 = MongoDBObject("user" -> "someOtherUser")
//    mongoColl += user1
//    mongoColl += user2
//    mongoColl.find
//    // mongoConn: com.mongodb.casbah.MongoConnection
//
//}