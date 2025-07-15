// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val largestNumber = rows * columns - 1

  val noOfDigits = largestNumber.toString().length + 1

  val formatString = "%${noOfDigits}d"

  var last = -columns

  for (i in 0..rows-1) {
    var current = 0

    if (i % 2 == 0) {
      for (j in 0..columns-1) {
        current = last + columns + j
        print(formatString.format(current))
      }

      println()
      last = current

    } else {
      for (j in 0..columns-1) {
        current = last + columns - j
        print(formatString.format(current))
      }

      last = current
      println()
    }
  }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/