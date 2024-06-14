import scala.io.StdIn

  object Exercise111 {

    def extractWords(text: String): List[String] = {
      // Define a regular expression to match punctuation marks at the edges of words
      val pattern = """^\W+|\W+$""".r

      // Split the text into words and remove surrounding punctuation from each word
      text.split("\\s+").toList.map { word =>
        pattern.replaceAllIn(word, "")
      }
    }

    def main(args: Array[String]): Unit = {
      // Prompt the user to enter a string
      println("Enter a string:")
      val input = StdIn.readLine().trim()

      // Extract words from the input string
      val words = extractWords(input)

      // Display the list of words
      println("Words with punctuation marks removed:")
      println(words)
    }
  }