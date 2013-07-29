package worksheets.books

object mytest {
        println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
        def updateRecordByName(r: Symbol, value: Any) {
                print(r+":"+value)
        }                                         //> updateRecordByName: (r: Symbol, value: Any)Unit
        
        updateRecordByName('favoriteAlbum, "OK Computer")
                                                  //> 'favoriteAlbum:OK Computer
        val a='abc                                //> a  : Symbol = 'abc
        a.name                                    //> res0: String = abc
        val name="momin"                          //> name  : String = momin
        val ab=s"hello ${name}"                   //> ab  : String = hello momin
        
        
        
        val rawstring=s"""
          <html>
              <body>
                  <div>${name}</div>
              </body>
          </html>
         """                                      //> rawstring  : String = "
                                                  //|           <html>
                                                  //|               <body>
                                                  //|                   <div>momin</div>
                                                  //|               </body>
                                                  //|           </html>
                                                  //|          "
                                                  
               val b1=new B                       //> b1  : worksheets.books.B = worksheets.books.B@4876d42
              b1.a                                //> res1: Int = 0
              b1.b                                //> res2: String = null
              b1.c                                //> res3: Option[String] = null
}

class B{
  var a:Int=_
  var b:String=_
  var c:Option[String]=_
}