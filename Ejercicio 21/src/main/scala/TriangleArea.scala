import scala.io.StdIn.readLine

  object TriangleArea {
    def main(args: Array[String]): Unit = {
      // Leer la base del triángulo desde el usuario
      print("Ingrese la longitud de la base del triángulo (b): ")
      val base = readLine().toDouble

      // Leer la altura del triángulo desde el usuario
      print("Ingrese la altura del triángulo (h): ")
      val height = readLine().toDouble

      // Calcular el área del triángulo
      val area = (base * height) / 2

      // Mostrar el resultado
      println(f"El área del triángulo con base $base y altura $height es: $area%.2f")
    }
  }