import org.scalatest._
import main._

class TestSuite extends FunSuite {
  test("ppascal") {
    assert(ppascal(0,0) == 1)
    assert(ppascal(2,1) == 3)
    assert(ppascal(4,2) == 17)
    assert(ppascal(5,2) == 31)
    assert(ppascal(6,6) == 1)
  }

  test("bbalance") {
    assert(bbalance("""
   Example of bbalanced: "(*)(*)"
""".toList))
    assert(bbalance("""
   Example of bbalanced: "(()*())"
""".toList))
    assert(bbalance("""
   Example of bbalanced: "(*())"
""".toList))
    assert(!bbalance("""
   Example of not bbalanced: "*()"
""".toList))
    assert(!bbalance("""
   Example of not bbalanced: "()*()"
""".toList))
  }

  test("bbalance-misc") {
    assert(bbalance("(((())))".toList))
    assert(bbalance("""
   Exercise 2: Parentheses BBalancing.
   Check whether given string (List[Char]) is well balanced.
   Ignore all other characters except "(", ")
""".toList))
    assert(!bbalance("""
   Exercise 2: Parentheses BBalancing.
   Check whether given string (List[Char]) is well balanced.
   Ignore all other characters except "(", ")", "*".
   Example of balanced: "(aaa(bb)ccc)", "aaa(eee)iii(ooo)uuu".
""".toList))
    assert(!bbalance("""
   Example of not balanced: "ppp)iii(kkk)aaa(ccc", "hhh(uuu()"
   Also, "*" is a bomb. So this exercise is called "BBalancing".
   If "*" appears between balanced parentheses, return false.
""".toList))
  }

  test("countChange-4") {
    assert(countChange(4,0,List(1,2)) === 0)
    assert(countChange(4,1,List(1,2)) === 0)
    assert(countChange(4,2,List(1,2)) === 2) // 2 2, 2 1 1
    assert(countChange(4,3,List(1,2)) === 2)
    assert(countChange(4,4,List(1,2)) === 3) // 1 1 1 1
    assert(countChange(4,999,List(1,2)) === 3)
  }

  test("countChange-5") {
    assert(countChange(5,0,List(1,2,3,5)) === 0)
    assert(countChange(5,1,List(1,2,3,5)) === 2) // 5, 3 2
    assert(countChange(5,2,List(1,2,3,5)) === 4) // 2 2 1, 3 1 1
    assert(countChange(5,3,List(1,2,3,5)) === 5) // 2 1 1 1
    assert(countChange(5,4,List(1,2,3,5)) === 5)
    assert(countChange(5,5,List(1,2,3,5)) === 6) // 1 1 1 1 1
    assert(countChange(5,999,List(1,2,3,5)) === 6)
  }
}
