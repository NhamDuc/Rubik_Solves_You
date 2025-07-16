// LocalFunctions/Task1.kt
package localFunctionsExercise1
import atomictest.eq

fun f(): Int {
  val g: () -> Int = { 47 }
  return g()
}

fun main() {
  f() eq 47
}