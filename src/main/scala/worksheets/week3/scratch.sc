package worksheets.week3

import com.lotus.scala.ScaRational

object scratch {
		new ScaRational(2,3)              //> res0: com.lotus.scala.ScaRational = 2/3
		def error(msg:String) =throw new Error(msg)
                                                  //> error: (msg: String)Nothing
		
		error("test")                     //> java.lang.Error: test
                                                  //| 	at worksheets.week3.scratch$$anonfun$main$1.error$1(worksheets.week3.scr
                                                  //| atch.scala:7)
                                                  //| 	at worksheets.week3.scratch$$anonfun$main$1.apply$mcV$sp(worksheets.week
                                                  //| 3.scratch.scala:9)
                                                  //| 	at scala.runtime.WorksheetSupport$$anonfun$$execute$1.apply$mcV$sp(Works
                                                  //| heetSupport.scala:75)
                                                  //| 	at scala.runtime.WorksheetSupport$.redirected(WorksheetSupport.scala:64)
                                                  //| 
                                                  //| 	at scala.runtime.WorksheetSupport$.$execute(WorksheetSupport.scala:74)
                                                  //| 	at worksheets.week3.scratch$.main(worksheets.week3.scratch.scala:5)
                                                  //| 	at worksheets.week3.scratch.main(worksheets.week3.scratch.scala)
}