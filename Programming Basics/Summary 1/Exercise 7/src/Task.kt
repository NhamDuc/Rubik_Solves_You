// Summary1/Task7.kt
package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0
  while (worker > 0) {
    val temp = worker % 10
    worker = worker / 10
    if (temp == digit) occurrences++
  }
  return occurrences
}

fun main() {
  println(countDigits(764241, 4)) // 2
}