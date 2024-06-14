import scala.io.StdIn.readLine

  object SquareRoot {
    def main(args: Array[String]): Unit = {
      // Leer el número del usuario
      print("Ingrese un número para calcular su raíz cuadrada: ")
      val x = readLine().toDouble

      // Inicializar la conjetura (guess)
      var guess = x / 2.0

      // Definir el umbral de precisión
      val tolerance = 1e-12

      // Iterar usando el método de Newton hasta que la conjetura sea suficientemente buena
      while (math.abs(guess * guess - x) > tolerance) {
        guess = (guess + x / guess) / 2.0
      }

      // Mostrar el resultado
      println(f"La raíz cuadrada aproximada de $x es $guess%.12f")
    }
  }