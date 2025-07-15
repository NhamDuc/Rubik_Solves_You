// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var x: Int = 0
  for(i in 0..number) {
    x += i
  }
  return x
}

fun main() {
  println(sum(10))  // 55
}