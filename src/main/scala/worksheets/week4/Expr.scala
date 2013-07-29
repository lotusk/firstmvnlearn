package worksheets.week4

trait Expr 
case class Number(n:Int) extends Expr
case class Var(n:String) extends Expr
case class Sum(e1:Expr,e2:Expr) extends Expr
case class Proc(e1:Expr,e2:Expr) extends Expr