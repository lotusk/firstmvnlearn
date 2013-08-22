package extractor

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-21
 * Time: 上午11:25
 *
 */
class Email {

}


object Domain {
  // The injection method (optional)
  def apply(parts: String*): String =
    parts.reverse.mkString(".")
  // The extraction method (mandatory)
  def unapplySeq(whole: String): Option[Seq[String]] =
    Some(whole.split("\\.").reverse)
}

object Twice {
  def apply(s: String): String = s + s

  def unapply(s: String): Option[String] = {
    val length = s.length / 2
    val half = s.substring(0, length)
    if (half == s.substring(length)) Some(half) else None
  }
}

object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase == s
}


object EMail {
  // The injection method (optional)
  def apply(user: String, domain: String) = user + "@" + domain

  // The extraction method (mandatory)
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }

  def userTwiceUpper(s: String) = s match {
    case EMail(Twice(x@UpperCase()), domain) =>
      "match: " + x + " in domain " + domain
    case _ =>
      "no match"
  }


  def main(args: Array[String]) {
    val x = "hello@163.com"
    val y = "ttttt"
    x match {
      case EMail(user, domain) => println(user)
    }
    y match {
      case EMail(user, domain) => println(user);
      case _ => println("none")
    }

    println(userTwiceUpper("DIDI@hotmail.com"))
    println(userTwiceUpper("DIDO@hotmail.com"))
    println(userTwiceUpper("didi@hotmail.com"))
    val list=List(1,2,3)
    val set=Set(1,2)
  }
}




