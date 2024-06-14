  import scala.io.StdIn.readLine

  object CommonDivisor {
    def main(args: Array[String]): Unit = {
      // Leer los dos números del usuario
      println("Ingrese el primer número entero positivo:")
      val a = readLine().toInt

      println("Ingrese el segundo número entero positivo:")
      val b = readLine().toInt

      // Calcular el MCD usando el algoritmo de Euclides
      val gcd = euclidGCD(a, b)

      // Mostrar el resultado
      println(s"El máximo común divisor de $a y $b es: $gcd")
    }

    def euclidGCD(a: Int, b: Int): Int = {
      if (b == 0) a
      else euclidGCD(b, a % b)
    }
  }