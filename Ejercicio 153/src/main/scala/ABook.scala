  import scala.io.Source
  import scala.collection.mutable.Map

  object ABook {
    def main(args: Array[String]): Unit = {
      val filename = "path_to_your_file.txt" // Replace with the path to your input file

      // Function to clean and process each word
      def processWord(word: String): String = {
        word.toLowerCase.replaceAll("[^a-z]", "") // Convert to lowercase and remove non-alphabetic characters
      }

      // Initialize a map to count occurrences of each letter
      val letterCount = Map[Char, Int]().withDefaultValue(0)

      // Read the file and process each line
      val source = Source.fromFile(filename)
      for (line <- source.getLines()) {
        // Split line into words, process each word, and update letter counts
        line.split("\\s+").foreach { word =>
          val cleanedWord = processWord(word)
          if (cleanedWord.nonEmpty) {
            val uniqueLetters = cleanedWord.toSet // Get unique letters in the word
            uniqueLetters.foreach { letter =>
              letterCount(letter) += 1
            }
          }
        }
      }
      source.close()

      // Total number of words
      val totalWords = letterCount.values.sum.toDouble

      // Calculate proportion of words for each letter
      val proportions = letterCount.mapValues(count => count / totalWords)

      // Print results
      for (letter <- 'a' to 'z') {
        val proportion = proportions.getOrElse(letter, 0.0)
        println(s"Letter '$letter' is used in ${proportion * 100}% of the words.")
      }

      // Find the letter used in the smallest proportion of words
      val minProportionLetter = proportions.minBy(_._2)._1
      println(s"The letter used in the smallest proportion of words is '$minProportionLetter'.")
    }
  }