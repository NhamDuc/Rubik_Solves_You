// VarAndVal/Task3.kt
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val t = x; x = y; y = t
  println(x)
  println(y)
}