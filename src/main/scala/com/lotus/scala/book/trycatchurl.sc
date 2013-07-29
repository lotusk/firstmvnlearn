package com.lotus.scala.book

object trycatchurl {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	import java.net.URL
	import java.net.MalformedURLException
	def urlFor(path: String) =
		try {
			new URL(path)
		} catch {
			case e: MalformedURLException =>
				new URL("http://www.scala-lang.org")
		}                                 //> urlFor: (path: String)java.net.URL

	urlFor("xx")                              //> res0: java.net.URL = http://www.scala-lang.org
	urlFor("http://www.abc.com")              //> res1: java.net.URL = http://www.abc.com
}