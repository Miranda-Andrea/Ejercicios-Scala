import scala.io.StdIn.readLine

  object FuelEfficiency {
    def main(args: Array[String]): Unit = {
      // Leer la eficiencia de combustible en MPG desde el usuario
      print("Ingrese la eficiencia de combustible en millas por galón (MPG): ")
      val mpg = readLine().toDouble

      // Convertir MPG a L/100 km
      val lPer100km = 235.214583 / mpg

      // Mostrar el resultado
      println(f"La eficiencia de combustible en litros por cada 100 kilómetros es: $lPer100km%.2f L/100 km")
    }
  }
