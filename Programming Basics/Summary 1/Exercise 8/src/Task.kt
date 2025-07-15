// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var numberRef = number
  var reverseNum = 0
  while (numberRef > 0) {
    val redundant = numberRef % 10
    reverseNum = reverseNum * 10 + redundant
    numberRef /= 10
  }
  return reverseNum
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}