// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  for (i in start-1..end step 5) {
    if (i == start-1)  continue
    println(i)
  }
}

fun main() {
  everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/