package com.lotus.scala.book

object test {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	def fileLines(file: java.io.File) =
		scala.io.Source.fromFile(file).getLines().toList
                                                  //> fileLines: (file: java.io.File)List[String]
	val filesHere2 = (new java.io.File(".")).listFiles
                                                  //> filesHere2  : Array[java.io.File] = Array(./jquery.simpledialog.0.1.1, ./myt
                                                  //| est, ./MavenModules, ./hs_err_pid19050.log, ./hs_err_pid2463.log, ./抓图3.
                                                  //| png, ./hs_err_pid8865.log, ./anew.html, ./s4maven.txt, ./hs_err_pid1902.log,
                                                  //|  ./arber, ./arber_1.html, ./test01.html, ./zk监控, ./max, ./ids, ./抓图1
                                                  //| .png, ./sample01.txt, ./抓图4.png, ./quartz-2.1.6, ./apache-nutch-1.5.1, .
                                                  //| /users.txt, ./抓图2.png, ./mysql, ./edufirst, ./arber.html, ./plan.txt, ./
                                                  //| 命令, ./test.html, ./hs_err_pid1945.log, ./school.txt, ./weibo.log, ./CA.k
                                                  //| ey, ./renren.html, ./CA.crt, ./temp.html, ./jdtfx.sql)
	val forLineLengths =
		for {
			file <- filesHere2
			if file.getName.endsWith(".txt")
			line <- fileLines(file)
			trimmed = line.trim
			if trimmed.matches(".*for.*")
		} yield trimmed.length            //> forLineLengths  : Array[Int] = Array(60, 65, 67, 63, 40, 62, 78, 100, 60, 77
                                                  //| , 107, 75, 47, 67, 69, 64, 121, 81, 38, 67, 55, 64, 98, 34, 90, 65, 91, 96, 
                                                  //| 87, 45, 67, 46, 20, 82, 45, 87, 72, 59, 36, 58, 103, 35, 74, 48, 41, 52, 73,
                                                  //|  78, 44, 84, 69, 46, 62, 53, 141, 45, 69, 62, 90, 21, 76, 98, 58, 75, 105, 7
                                                  //| Output exceeds cutoff limit. 


}