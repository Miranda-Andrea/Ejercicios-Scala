object SumListNumber {
    def main(args: Array[String]): Unit = {
      var sum: Double = 0.0
      var continue = true

      while (continue) {
        // Leer entrada del usuario
        println("Ingresa un número (o una línea en blanco para terminar):")
        val input = scala.io.StdIn.readLine()

        if (input.isEmpty) {
          continue = false
        } else {
          // Intentar convertir la entrada en un número
          try {
            val number = input.toDouble
            sum += number
            println(s"Suma actual: $sum")
          } catch {
            case _: NumberFormatException =>
              println("Error: Entrada no válida, por favor ingresa un número.")
          }
        }
      }

      println(s"Suma final: $sum")
    }
  }