object MorseCode {
   val morseCode: Map[Char, String] = Map(
      'A' -> ".-", 'B' -> "-...", 'C' -> "-.-.", 'D' -> "-..", 'E' -> ".",
      'F' -> "..-.", 'G' -> "--.", 'H' -> "....", 'I' -> "..", 'J' -> ".---",
      'K' -> "-.-", 'L' -> ".-..", 'M' -> "--", 'N' -> "-.", 'O' -> "---",
      'P' -> ".--.", 'Q' -> "--.-", 'R' -> ".-.", 'S' -> "...", 'T' -> "-",
      'U' -> "..-", 'V' -> "...-", 'W' -> ".--", 'X' -> "-..-", 'Y' -> "-.--",
      'Z' -> "--..",
      '0' -> "-----", '1' -> ".----", '2' -> "..---", '3' -> "...--", '4' -> "....-",
      '5' -> ".....", '6' -> "-....", '7' -> "--...", '8' -> "---..", '9' -> "----."
    )

    def translateToMorse(message: String): String = {
      message.toUpperCase
        .filter(char => morseCode.contains(char))
        .map(char => morseCode(char))
        .mkString(" ")
    }

    def main(args: Array[String]): Unit = {
      // Prompt the user to enter a message
      println("Enter a message:")
      val input = scala.io.StdIn.readLine()

      // Translate the message to Morse code
      val morseMessage = translateToMorse(input)

      // Display the Morse code message
      println("Morse code translation:")
      println(morseMessage)
    }
  }