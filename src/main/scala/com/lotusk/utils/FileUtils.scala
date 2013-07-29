package com.lotusk.utils

import java.io.PrintWriter
import java.io.File

object FileUtils {
	def writeToFile(fileName: String)(codeBlock: PrintWriter => Unit) = {
		val writer = new PrintWriter(new File(fileName))
		try {
			codeBlock(writer)
		} finally {
			writer.close()
		}
	}
}