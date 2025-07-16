// Recursion/Task3.kt
package recursionExercise3
import atomictest.eq
import sequencesExercise8.fibonacci

// For comparison
fun fibonacciRecursive(n: Int): Long {
  tailrec fun fibonacci(
    n: Int,
    current: Long,
    next: Long
  ): Long {
    if (n == 0) return current
    return fibonacci(
      n - 1, next, current + next)
  }

  return fibonacci(n, 0L, 1L)
}

fun fibonacciIterative(n: Int): Long {
  var sum = 0L
  var prev1 = 0L
  var prev2 = 0L
  for (i in 0..n) {
    if (i == 0) {
      sum = 0
    }
    if (i == 1 || i == 2) {
      prev1 = 1
      sum = prev1
      prev2 = 1
    } else {
      sum = prev1 + prev2
      prev2 = prev1
      prev1 = sum
    }
  }
  return sum
}

fun main() {
  (0..8).map { fibonacciRecursive(it) } eq
    "[0, 1, 1, 2, 3, 5, 8, 13, 21]"
  fibonacciRecursive(22) eq 17711
  fibonacciRecursive(50) eq 12586269025

  (0..8).map { fibonacciIterative(it) } eq
    "[0, 1, 1, 2, 3, 5, 8, 13, 21]"
  fibonacciIterative(22) eq 17711
  fibonacciIterative(50) eq 12586269025

  println(fibonacciIterative(17))
  println(fibonacciIterative(33))
  println(fibonacciIterative(39))
}