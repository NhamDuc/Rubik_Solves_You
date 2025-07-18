// FoldingLists/Task1.kt
package foldingListsExercise1
import atomictest.eq

fun <T> List<T>.size(): Int =
  this.fold(0){ siz, n ->
    siz + 1
  }

fun main() {
  val list = listOf(1, 2, 3)
  list.size() eq 3
}