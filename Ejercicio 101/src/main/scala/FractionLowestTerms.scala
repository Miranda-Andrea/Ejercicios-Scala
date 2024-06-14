object FractionLowestTerms {
    def main(args: Array[String]): Unit = {
      println("Enter the numerator:")
      val numerator = scala.io.StdIn.readInt()
      println("Enter the denominator:")
      val denominator = scala.io.StdIn.readInt()

      val (reducedNumerator, reducedDenominator) = reduceFractionToLowestTerms(numerator, denominator)
      println(s"The reduced fraction is: $reducedNumerator / $reducedDenominator")
    }

    def reduceFractionToLowestTerms(numerator: Int, denominator: Int): (Int, Int) = {
      val gcdValue = gcd(numerator, denominator)
      val reducedNumerator = numerator / gcdValue
      val reducedDenominator = denominator / gcdValue
      (reducedNumerator, reducedDenominator)
    }

    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }
  }