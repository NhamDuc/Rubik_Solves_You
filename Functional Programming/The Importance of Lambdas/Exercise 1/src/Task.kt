// ImportanceOfLambdas/Task1.kt
package theImportanceOfLambdasExercise1
import atomictest.eq
import typechecking.name

class Person(val name: String, val age: Int)

fun List<Person>.getNamesOfAdults(): List<String> =
  this.filter { it.age > 17 }.map { it.name }


fun main() {
  val people = listOf(Person("Alice", 17), Person("Bob", 19))
  people.getNamesOfAdults() eq listOf("Bob")
}