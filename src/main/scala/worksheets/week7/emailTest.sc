package worksheets.week7
import scala.math._
object emailTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val emailText=List("email","e-mail")            //> emailText  : List[java.lang.String] = List(email, e-mail)
  val html="aaae-mail"                            //> html  : java.lang.String = aaae-mail
  
  	val list=for{
			t <- emailText.toStream
			index = html.indexOf(t)
			if index >0
		}yield (t,index)                  //> list  : scala.collection.immutable.Stream[(java.lang.String, Int)] = Stream(
                                                  //| (e-mail,3), ?)
     list.take(1).toList                          //> res0: List[(java.lang.String, Int)] = List((e-mail,3))
  
  def emailAttr(html:String):Option[(String,Int)]={
		val list=for{
			t <- emailText.toStream
			index = html.indexOf(t)
			if index >0
		}yield (t,index)
		list.headOption
	}                                         //> emailAttr: (html: String)Option[(String, Int)]
	
	val test=scala.io.Source.fromFile("/home/lucifer/workspace/email-crawler/datapage/extractor.html").mkString
                                                  //> test  : String = "
                                                  //| <?xml version="1.0" encoding="UTF-8"?>
                                                  //| <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w
                                                  //| 3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
                                                  //| 
                                                  //| 
                                                  //| <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
                                                  //|   <head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /
                                                  //| >
                                                  //|     
                                                  //|     <meta name="Generator" content="iWeb 3.0.4" />
                                                  //|     <meta name="iWeb-Build" content="local-build-20121027" />
                                                  //|     <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
                                                  //|     <meta name="viewport" content="width=700" />
                                                  //|     <title>- ANAK Studio -</title>
                                                  //|     <link rel="stylesheet" type="text/css" media="screen,print" href="Home_f
                                                  //| iles/Home.css" />
                                                  //|     <!--[if lt IE 8]><link rel='stylesheet' type='text/css' media='screen,pr
                                                  //| int' href='Home_files/HomeIE.css'/><![endif]-->
                                                  //|     <!--[if gte IE 8]><link rel='stylesheet' type='text/css' media='screen,p
                                                  //| rint' h
                                                  //| Output exceeds cutoff limit.
	val ea=emailAttr(test).get                //> ea  : (String, Int) = (e-mail,7542)
	max(0, ea._2-500)                         //> res1: Int = 7042
	min(test.length,ea._2+500)                //> res2: Int = 8042
	 test.substring(max(0, ea._2-500), min(test.length,ea._2+500))
                                                  //> res3: java.lang.String = 85px; left: 1px; position: absolute; top: 5px; widt
                                                  //| h: 690px; z-index: 1; " class="style_SkipStroke_2 shape-with-text">
                                                  //|             <div class="text-content graphic_textbox_layout_style_default_Ex
                                                  //| ternal_690_85" style="padding: 0px; ">
                                                  //|               <div class="graphic_textbox_layout_style_default">
                                                  //|                 <p style="padding-bottom: 0pt; padding-top: 0pt; " class="pa
                                                  //| ragraph_style_3">Contact: Alex Krotz <span class="style_3">//</span> phone: 
                                                  //| 647.525.2625  <span class="style_3">//</span> e-mail: <a title="mailto:alex@
                                                  //| anakstudio.ca" href="mailto:alex@anakstudio.ca">alex@anakstudio.ca</a> // we
                                                  //| b: <a class="class1" title="http://alexkrotz.ca" href="http://alexkrotz.ca">
                                                  //| alexkrotz.ca</a></p>
                                                  //|               </div>
                                                  //|             </div>
                                                  //|           </div>
                                                  //|           
                                                  //| 
                                                  //| 
                                                  //|           <div style="height: 50px; width: 50px;  height: 50px; left: 225px;
                                                  //|  position: absolute; top: 34px; wid
                                                  //| Output exceeds cutoff limit.
	"23e-mail".indexOf("e-mail")              //> res4: Int = 2
}