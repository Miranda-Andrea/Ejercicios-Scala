import scala.io.StdIn.readLine

  object EvenOrOdd {
    def main(args: Array[String]): Unit = {
      // Leer un número entero desde el usuario
      print("Ingrese un número entero: ")
      val number = readLine().toInt

      // Determinar si el número es par o impar
      if (number % 2 == 0) {
        println(s"El número $number es par.")
      } else {
        println(s"El número $number es impar.")
      }
    }
  }