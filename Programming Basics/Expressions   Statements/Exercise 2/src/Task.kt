// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

import typechecking.name

fun f(x: Int, y: Int): Int = x + y

fun g(x: String, y: String): String = x + y


fun h() = println("h()")


fun main() {
  val x = f(1,2)
  val y = g("a", "b")
  val z = h()
  println(x.name)
  println(y.name)
  println(z.name)
}