// Sequences/Task8.kt
package sequencesExercise8
import atomictest.eq

fun fibonacci(): Sequence<Int> {
  var previous = 1
  return generateSequence(0 to 1) { (prev, cur) ->
    cur to (prev + cur) // prev = cur and so on
  }.map { it.first }
}

fun main() {
  fibonacci().take(10).toList() eq
    listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
}