import java.io.PrintWriter
import java.io.File
class WriteToFile {
	def writeToFile(fileName:String)(codeBlock:PrintWriter=>Unit)={
	  val writer=new PrintWriter(new File(fileName))
	  try{
		  codeBlock(writer)
	  }finally {
		  writer.close()
	  }
	}
	writeToFile("d:/output.txt"){writer=>
	  writer write "hello from Scala"
	  println("sysout ok")
	}
}

//new WriteToFile