package com.lotus.scala.book

object fortest {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	val filesHere = (new java.io.File(".")).listFiles
                                                  //> filesHere  : Array[java.io.File] = Array(./jquery.simpledialog.0.1.1, ./myte
                                                  //| st, ./MavenModules, ./hs_err_pid19050.log, ./hs_err_pid2463.log, ./抓图3.p
                                                  //| ng, ./hs_err_pid8865.log, ./anew.html, ./s4maven.txt, ./hs_err_pid1902.log, 
                                                  //| ./arber, ./arber_1.html, ./test01.html, ./zk监控, ./max, ./ids, ./抓图1.
                                                  //| png, ./sample01.txt, ./抓图4.png, ./quartz-2.1.6, ./apache-nutch-1.5.1, ./
                                                  //| users.txt, ./抓图2.png, ./mysql, ./edufirst, ./arber.html, ./plan.txt, ./�141 ��令, ./test.html, ./hs_err_pid1945.log, ./school.txt, ./weibo.log, ./CA.ke
                                                  //| y, ./renren.html, ./CA.crt, ./temp.html, ./jdtfx.sql)
	for (file <- filesHere)
		println(file)                     //> ./jquery.simpledialog.0.1.1
                                                  //| ./mytest
                                                  //| ./MavenModules
                                                  //| ./hs_err_pid19050.log
                                                  //| ./hs_err_pid2463.log
                                                  //| ./抓图3.png
                                                  //| ./hs_err_pid8865.log
                                                  //| ./anew.html
                                                  //| ./s4maven.txt
                                                  //| ./hs_err_pid1902.log
                                                  //| ./arber
                                                  //| ./arber_1.html
                                                  //| ./test01.html
                                                  //| ./zk监控
                                                  //| ./max
                                                  //| ./ids
                                                  //| ./抓图1.png
                                                  //| ./sample01.txt
                                                  //| ./抓图4.png
                                                  //| ./quartz-2.1.6
                                                  //| ./apache-nutch-1.5.1
                                                  //| Output exceeds cutoff limit. 

}