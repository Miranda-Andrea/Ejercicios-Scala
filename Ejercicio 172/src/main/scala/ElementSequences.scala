import scala.io.Source
import scala.collection.mutable

object ElementSequences {
  def main(args: Array[String]): Unit = {
    // Ruta del archivo de elementos
    val filePath = "elements.txt"  // Cambia esto a la ruta completa si es necesario

    // Cargar los datos de los elementos
    val elements = loadElements(filePath)

    // Solicitar al usuario que ingrese el nombre de un elemento
    println("Ingrese el nombre de un elemento:")
    val elementName = scala.io.StdIn.readLine().trim

    // Verificar si el nombre del elemento es válido
    if (!elements.contains(elementName)) {
      println(s"$elementName no es un nombre de elemento válido.")
    } else {
      // Encontrar la secuencia más larga que comienza con el elemento ingresado
      val longestSequence = findLongestSequence(elementName, elements)
      // Mostrar la secuencia
      println(s"La secuencia más larga comenzando con $elementName es:")
      longestSequence.foreach(println)
    }
  }

  def loadElements(fileName: String): Map[String, String] = {
    try {
      // Leer el archivo y cargar los elementos en un mapa
      val lines = Source.fromFile(fileName).getLines().toList
      lines.map { line =>
        val parts = line.split(",")
        (parts(1).trim, parts(0).trim)
      }.toMap
    } catch {
      case e: java.io.FileNotFoundException =>
        println(s"No se pudo encontrar el archivo: $fileName")
        Map()
    }
  }

  def findLongestSequence(startElement: String, elements: Map[String, String]): List[String] = {
    val memo = mutable.Map[String, List[String]]()

    def findSequence(currentElement: String, remainingElements: Set[String]): List[String] = {
      if (memo.contains(currentElement)) {
        return memo(currentElement)
      }

      val lastChar = currentElement.last.toLower
      val possibleNextElements = remainingElements.filter(_.toLowerCase.startsWith(lastChar.toString))

      val sequences = for {
        nextElement <- possibleNextElements.toList
        nextSequence = findSequence(nextElement, remainingElements - nextElement)
      } yield currentElement :: nextSequence

      val longestSequence = if (sequences.isEmpty) List(currentElement) else sequences.maxBy(_.length)
      memo(currentElement) = longestSequence
      longestSequence
    }

    findSequence(startElement, elements.keys.toSet)
  }
}