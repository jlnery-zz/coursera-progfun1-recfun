package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || (r == c)) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def loop(opens: List[Char], closed: List[Char], chars: List[Char]): Boolean = {
      if (chars.size == 1 && chars.head.equals('(')) false
      else if (chars.isEmpty)
        if (opens.size == closed.size)
          true
        else
          false
      else if (chars.head.equals('(')) loop(opens :+ '(', closed, chars.tail)
      else if (chars.head.equals(')')) loop(opens, closed :+ ')', chars.tail)

      else loop(opens, closed, chars.tail)
    }

    loop(List(), List(), chars)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
