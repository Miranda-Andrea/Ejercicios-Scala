 import scala.io.StdIn.readLine

  object FacesOnMoney {
    def main(args: Array[String]): Unit = {
      // Mapa de denominaciones a individuos
      val banknotes = Map(
        1 -> "George Washington",
        2 -> "Thomas Jefferson",
        5 -> "Abraham Lincoln",
        10 -> "Alexander Hamilton",
        20 -> "Andrew Jackson",
        50 -> "Ulysses S. Grant",
        100 -> "Benjamin Franklin"
      )

      // Leer la denominación del usuario
      print("Ingrese la denominación del billete: $")
      val denomination = readLine().toInt

      // Verificar y mostrar el resultado
      banknotes.get(denomination) match {
        case Some(individual) => println(s"El billete de $denomination dólares tiene la imagen de $individual.")
        case None => println(s"No existe un billete de $denomination dólares en circulación.")
      }
    }
  }