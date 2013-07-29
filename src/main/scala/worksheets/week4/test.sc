
trait List[T] {
        def isEmpty: Boolean
        def head: T
        def tail: List[T]
}
object test {
        println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

        class Cons[T](val head: T, val tail: List[T]) extends List[T] {
                def isEmpty = false
        }
        new Cons(null,null)                       //> res0: test.Cons[Null] = test$$anonfun$main$1$Cons$1@120cc56
        
}