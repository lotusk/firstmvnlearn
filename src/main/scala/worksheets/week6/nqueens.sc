package worksheets.week6

object nqueens {
	def queens(n: Int): Set[List[Int]] = {
		def placeQueens(k: Int): Set[List[Int]] = {
			if (k == 0) Set(List())
			else
				for {
					quees <- placeQueens(k - 1)
					col <- 0 until n
					if (isSafe(col, quees))
				} yield col :: quees
		}
		placeQueens(n)
	}                                         //> queens: (n: Int)Set[List[Int]]

	def isSafe(col: Int, queens: List[Int]): Boolean = {
		val row = queens.length
		val queenWithRow = (row - 1 to 0 by -1) zip queens
		queenWithRow forall {
			case (r, c) => col != c && math.abs(col - c) != row - r
		}
	}                                         //> isSafe: (col: Int, queens: List[Int])Boolean

	def show(queens: List[Int]) = {
	   val lines=
	     for(col <- queens.reverse)
	       yield Vector.fill(queens.length)("*  ").updated(col,"X  ").mkString
	       
	       "\n"+ (lines mkString "\n")
	}                                         //> show: (queens: List[Int])java.lang.String

	queens(4)                                 //> res0: Set[List[Int]] = Set(List(1, 3, 0, 2), List(2, 0, 3, 1))
  (queens(8) take 3 map show) mkString   "\n"     //> res1: String = "
                                                  //| *  *  *  *  X  *  *  *  
                                                  //| *  *  X  *  *  *  *  *  
                                                  //| X  *  *  *  *  *  *  *  
                                                  //| *  *  *  *  *  X  *  *  
                                                  //| *  *  *  *  *  *  *  X  
                                                  //| *  X  *  *  *  *  *  *  
                                                  //| *  *  *  X  *  *  *  *  
                                                  //| *  *  *  *  *  *  X  *  
                                                  //| 
                                                  //| *  X  *  *  *  *  *  *  
                                                  //| *  *  *  X  *  *  *  *  
                                                  //| *  *  *  *  *  X  *  *  
                                                  //| *  *  *  *  *  *  *  X  
                                                  //| *  *  X  *  *  *  *  *  
                                                  //| X  *  *  *  *  *  *  *  
                                                  //| *  *  *  *  *  *  X  *  
                                                  //| *  *  *  *  X  *  *  *  
                                                  //| 
                                                  //| *  *  *  X  *  *  *  *  
                                                  //| *  *  *  *  *  X  *  *  
                                                  //| *  *  *  *  *  *  *  X  
                                                  //| *  *  X  *  *  *  *  *  
                                                  //| X  *  *  *  *  *  *  *  
                                                  //| *  *  *  *  *  *  X  *  
                                                  //| *  *  *  *  X  *  *  *  
                                                  //| *  X  *  *  *  *  *  *  "
}