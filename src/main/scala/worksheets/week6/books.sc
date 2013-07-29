package worksheets.week6

object books {
	case class Book(title: String, authors: List[String])

	val books = Set(
		Book(title = "Structure and Interpretation of Computer Programs", authors = List("Abelson, Harald", "Sussman, Gerald J.")),
		Book(title = "Introduce of Functional Programming", authors = List("Bird, Richard", "wadler, Phil.")),
		Book(title = "Effective Java", authors = List("Bloch, Joshua")),
		Book(title = "Java Puzzlers", authors = List("Bloch, Joshua", "Gafter, Neal")),
		Book(title = "Not a Book", authors = List("Bloch, Joshua", "Lucifer ,x")),
		Book(title = "Programming in scala", authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))
                                                  //> books  : scala.collection.immutable.Set[worksheets.week6.books.Book] = Set(B
                                                  //| ook(Effective Java,List(Bloch, Joshua)), Book(Not a Book,List(Bloch, Joshua,
                                                  //|  Lucifer ,x)), Book(Programming in scala,List(Odersky, Martin, Spoon, Lex, V
                                                  //| enners, Bill)), Book(Structure and Interpretation of Computer Programs,List(
                                                  //| Abelson, Harald, Sussman, Gerald J.)), Book(Java Puzzlers,List(Bloch, Joshua
                                                  //| , Gafter, Neal)), Book(Introduce of Functional Programming,List(Bird, Richar
                                                  //| d, wadler, Phil.)))
	for (
		b <- books;
		a <- b.authors if a startsWith "Bloch,"
	) yield b.title                           //> res0: scala.collection.immutable.Set[String] = Set(Effective Java, Not a Boo
                                                  //| k, Java Puzzlers)
/**
  (for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors;
    a2 <- b2.authors
    if a1 == a2
  } yield a1 ).distinct
**/
  for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors;
    a2 <- b2.authors
    if a1 == a2
  } yield a1                                      //> res1: scala.collection.immutable.Set[String] = Set(Bloch, Joshua)

val a="ab"                                        //> a  : java.lang.String = ab
val b="bc"                                        //> b  : java.lang.String = bc
	
}