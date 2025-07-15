// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var fraction = 1L
  for (i in 1..n) {
    fraction *= i
  }
  return fraction
}

fun main() {
  println(factorial(10))  // 3628800
}