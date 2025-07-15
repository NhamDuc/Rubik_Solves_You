// Summary1/Task6.kt
package summaryIExercise6

import kotlin.ranges.step

fun everyFifthNonSpace(s: String) {
  var i = 0
  for (c in s) {
    if (c != ' ') {
      i++
      if (i % 5 == 0) {
        println(c)
      }
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/