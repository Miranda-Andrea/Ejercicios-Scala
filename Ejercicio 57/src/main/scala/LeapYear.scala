 import scala.io.StdIn.readLine

  object LeapYear {
    def main(args: Array[String]): Unit = {
      // Leer el año desde el usuario
      print("Ingrese un año: ")
      val year = readLine().toInt

      // Determinar si es un año bisiesto
      val isLeapYear = if (year % 400 == 0) {
        true
      } else if (year % 100 == 0) {
        false
      } else if (year % 4 == 0) {
        true
      } else {
        false
      }

      // Mostrar el resultado
      if (isLeapYear) {
        println(s"$year es un año bisiesto.")
      } else {
        println(s"$year no es un año bisiesto.")
      }
    }
  }