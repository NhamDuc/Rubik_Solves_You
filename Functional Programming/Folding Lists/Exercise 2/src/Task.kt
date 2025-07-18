// FoldingLists/Task2.kt
package foldingListsExercise2
import atomictest.eq

fun <T> List<T>.count(predicate: (T) -> Boolean): Int =
  this.filter { predicate(it) }.fold(0) {count, _ ->
    count + 1
  }

fun main() {
  val list = listOf(1, -2, 3)
  list.count { it > 0 } eq 2
}