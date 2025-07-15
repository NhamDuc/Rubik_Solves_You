// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val new = int + double
  val new1 = string + character
  val new2 = string + int
  val new3 = string + double
  val new4: Char = character + int

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:

}