// Recursion/Task2.kt
package recursionExercise2
import atomictest.eq

fun factorial(n: Long): Long {
  if (n <= 1) return 1
  return n * factorial(n-1)
}

fun main() {
  factorial(3) eq 6
  factorial(4) eq 24
  factorial(11) eq 39916800
}