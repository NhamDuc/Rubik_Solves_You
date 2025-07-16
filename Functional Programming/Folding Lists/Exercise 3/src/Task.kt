// FoldingLists/Task3.kt
package foldingListsExercise3
import atomictest.eq

fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean =
  this.filter { predicate(it) }.fold(0) {count, _ ->
    count + 1
  } > 0

fun main() {
  val list = listOf(1, -2, 3)
  list.any { it < 0 } eq true
}