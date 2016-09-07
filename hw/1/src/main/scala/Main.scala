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
   Exercise 2: Parentheses BBalancing.
   Check whether given string (List[Char]) is well balanced.
   Ignore all other characters except "(", ")", "*".
   Example of balanced: "(aaa(bb)ccc)", "aaa(eee)iii(ooo)uuu".
   Example of not balanced: "ppp)iii(kkk)aaa(ccc", "hhh(uuu()"
   Also, "*" is a bomb. So this exercise is called "BBalancing".
   If there exists some "(", ")" and "*" is inside them, bomb is safe so ignore it.
   Otherwise, if bomb appears out of all parentheses, you should return false.
   Example of bbalanced: "(*)(*)"
   Example of bbalanced: "(()*())"
   Example of bbalanced: "(*())"
   Example of not bbalanced: "*()"
   Example of not bbalanced: "()*()"
   */
  def bbalance(chars: List[Char]): Boolean = ???

  /*
   Exercise 3: Counting Change.
   You can use coins with value listed in "coins".
   Return the number of cases that you can bould "money" with given sort of coins.
   You can use same coin at most "max" times.
   Ignore ordering: 4 = 1 + 1 + 2 = 1 + 2 + 1 = 2 + 1 + 1 is counted as same.
   */
  //You may assume money >= 0, max >= 0
  def countChange(money: Int, max: Int, coins: List[Int]): Int = ???
}
