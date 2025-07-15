// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  for (i in 0..n-1) {
    repeat(n-1-i) { print(' ') }
    repeat(i * 2 + 1) { print("#") }
    println()
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/