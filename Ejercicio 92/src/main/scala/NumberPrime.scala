object NumberPrime {
    def main(args: Array[String]): Unit = {
      println("Enter a number:")
      val number = scala.io.StdIn.readInt()

      if (isPrime(number)) {
        println(s"$number is a prime number.")
      } else {
        println(s"$number is not a prime number.")
      }
    }

    def isPrime(num: Int): Boolean = {
      if (num <= 1) {
        return false
      }
      for (i <- 2 until num) {
        if (num % i == 0) {
          return false
        }
      }
      true
    }
  }