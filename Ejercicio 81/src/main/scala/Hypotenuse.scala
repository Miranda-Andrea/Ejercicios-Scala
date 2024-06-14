 import scala.math.sqrt

  object Main {
    def main(args: Array[String]): Unit = {
      println("Enter the lengths of the two shorter sides of a right triangle:")
      print("Side 1: ")
      val side1 = scala.io.StdIn.readDouble()
      print("Side 2: ")
      val side2 = scala.io.StdIn.readDouble()

      val hypotenuse = computeHypotenuse(side1, side2)
      println(s"The hypotenuse of the triangle is: $hypotenuse")
    }

    def computeHypotenuse(side1: Double, side2: Double): Double = {
      sqrt(side1 * side1 + side2 * side2)
    }
  }