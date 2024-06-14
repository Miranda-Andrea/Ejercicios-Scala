object Sublist {
    // Function to generate all sublists of a list
    def generateSublists[T](list: List[T]): List[List[T]] = {
      // Using recursion to generate sublists
      list match {
        case Nil => List(Nil)
        case head :: tail =>
          val tailSublists = generateSublists(tail)
          tailSublists ++ tailSublists.map(sublist => head :: sublist)
      }
    }
    def main(args: Array[String]): Unit = {
      // Test cases
      val list1 = List(1, 2, 3)
      val list2 = List('a', 'b', 'c')
      val list3 = List("apple", "banana", "cherry")
      val list4 = List(1.1, 2.2, 3.3)

      // Examples of generating all sublists
      println("Sublists of list1:")
      println(generateSublists(list1))

      println("\nSublists of list2:")
      println(generateSublists(list2))

      println("\nSublists of list3:")
      println(generateSublists(list3))

      println("\nSublists of list4:")
      println(generateSublists(list4))
    }
  }