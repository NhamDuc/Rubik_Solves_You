// LoopingAndRanges/Task2.kt
package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
  var sum = 0L
  for (i in 1..n) {
    sum += factorial(i)
  }
  return sum
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}