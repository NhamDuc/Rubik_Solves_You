// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var t =""
  s.forEachIndexed { i, c ->
    if (i % 2 == 0) t+=c
  }
  return t
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/