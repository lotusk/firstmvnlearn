import com.sun.org.apache.bcel.internal.generic.IfInstruction
import java.util.ArrayList

object test {
  println("Welcome to the Scala worksheet")
  var list="xxx(just an)(abc) example".toList
  list.head=='('
  list.tail
  list.last
  def balance(chars: List[Char]): Boolean = {
		def reduce(lefts: List[Char]):List[Char]={
		 if(lefts.isEmpty){
		 	 lefts
		 }else	if(lefts.head==')'){
				lefts
			}
			else if(lefts.head=='('){
				var tails=reduce(lefts.tail)
				if(tails.isEmpty){
					lefts
				}
				else if(tails.head==')'){
					reduce(tails.tail)
				}else{
					tails
				}
			}else {
				reduce(lefts.tail)
			}
		}
		var finalChars=reduce(chars)
		finalChars.isEmpty
  }
  balance(list)
  val a="abc"
  
}