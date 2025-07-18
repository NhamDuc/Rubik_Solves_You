// ManipulatingLists/Task6.kt
package manipulatingListsExercise6
import atomictest.eq

fun <T> List<List<T>>.flatten(): List<T> {
  return this.flatMap { it }
}



fun main() {
  val listOfLists = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

  listOfLists.flatten() eq listOf(1, 2, 3, 4, 5, 6)
}