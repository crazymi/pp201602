package submission
import scala.annotation.tailrec

object main {
  def main(args: Array[String]) {
    // Type "sbt run" in this project's home directory,
    // and you will see "Hello, World!".
    // This is just to demonstrate "Hello, World!".
    // You do not need to put any code here for homework.
    println("Hello, World!")

    // Currently, you will face RuntimeException here.
    // When you implement exercise 1,
    // RuntimeException will go away
    // and you will see the same triangle in description.
    println("PPascal's Triangle")
    val n = 8
    for(row <- 0 to n) {
      for(col <- 0 to (n-row)) print("   ")
      for(col <- 0 to row) print(ppascal(row, col).toString.padTo(6, ' '): String)
      println()
    }
  }

  /*
   Implement below functions, which is currently blank. (???)
   You may run "sbt compile" to check compilation error,
   and "sbt test" to run given simple tests, just for sanity check.
   Passing "sbt test" does *NOT* ensure your assignment passes our real test data.

   You should *NOT* import any library.

   Before asking for clarification of problem statement, look through test data.

   For below exercises, there will be no big test data.
   It means, you need not worry about integer overflow/stack overflow/time limit/etc
   unless your implementation is really weird.
   */

  /*
   Exercise 1: PPascal's Triangle.
   As this course is PP, we are going to build PPascal's Triangle.
   This is exactly the same with Pascal's Triangle (google it!) except that
   it adds upper left value once more.
   Write the program to calculate the number in PPascal's Triangle, given row
   and column.

                           1
                        1     1
                     1     3     1
                  1     5     7     1
               1     7     17    15    1
            1     9     31    49    31    1
         1     11    49    111   129   63    1
      1     13    71    209   351   321   127   1
   1     15    97    351   769   1023  769   255   1
   */
  //You may assume 0 <= r <= 8 && 0 <= c <= r
  def ppascal(r: Int, c: Int): Int = ???

  /*
   Exercise 2: Fibonacci
   A) Given n, calculate n'th value of Fibonacci number. (https://en.wikipedia.org/wiki/Fibonacci_number)
   Having exponential time complexity is OK for this problem.
   You may assume 1 <= n <= 20.
   */
  def fibA(n: Int): Int = ???

  /*
   B) Same with a), but you should implement it faster.
   Having exponential time complexity is NOT OK for this problem.
   Your algorithm should take linear time complexity.
   You may assume 1 <= n <= 10^3.
   */
  def fibB(n: Int): BigInt = {
    /*
     This skeleton code is just for hint. You may implement this problem in your own way.
     n := index for Fibonacci number, n >= 2
     output := (n-1)'th Fibonacci number and n'th Fibonacci number
     */
    /*
     You can implement remaining parts without knowledge of pair type.
     If you want to know more about pair/tuple, search "scala tuple" on google.
     In short, you can build tuple with "(_, _, _, .. _,)" syntax,
     and get n'th element with "._n".
     */
    def _fibB(n: Int): (BigInt, BigInt) = {
      if(???) ???
      else {
        val (pastPast, past) = _fibB(n - 1)
        ???
      }
    }
    ???
  }

  /*
   C) Same with b), but you should implement it with tail recursion.
   By using tail recursion strategy, your algorithm will not take linear stack depth.
   Instead it will only take constant stack depth.
   You may assume 1 <= n <= 10^3.
   */
  def fibC(n: Int): BigInt = {
    /*
     This skeleton code is just for hint. You may implement this problem in your own way.
     idx := current index
     current := Fibonacci number for idx.
     past := Fibonacci number for idx-1.
     output := n'th Fibonacci number
     */
    @tailrec
    def _fibC(idx: Int, current: BigInt, past: BigInt): BigInt = ???
    ???
  }
}
