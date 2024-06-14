 import scala.io.StdIn.readLine

  object Average {
    def main(args: Array[String]): Unit = {
      var total = 0.0
      var count = 0

      println("Ingrese una serie de valores (ingrese 0 para terminar):")

      // Leer el primer valor
      var value = readLine().toDouble

      // Verificar si el primer valor es 0
      if (value == 0) {
        println("No se ingresaron valores para calcular el promedio.")
      } else {
        // Leer valores hasta que se ingrese 0
        while (value != 0) {
          total += value
          count += 1
          value = readLine().toDouble
        }

        // Calcular y mostrar el promedio
        val average = total / count
        println(f"El promedio de los valores ingresados es: $average%.2f")
      }
    }
  }