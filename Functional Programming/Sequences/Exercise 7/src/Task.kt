// Sequences/Task7.kt
package sequencesExercise7

fun oddWithoutDigitOne(): Sequence<Int> {
  return generateSequence(3) { it + 2 }
    .filter { !it.toString().contains('1') }
}

fun main() {
  val sequence = oddWithoutDigitOne()
  val sum20 = sequence.take(20).sum()
  println(sum20)
}