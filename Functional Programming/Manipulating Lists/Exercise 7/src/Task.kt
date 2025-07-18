// ManipulatingLists/Task7.kt
package manipulatingListsExercise7
import atomictest.eq

fun <T> List<T>.filter(f: (T) -> Boolean): List<T> =

    this.flatMap {
      if (f(it)) {
        listOf(it)
      } else {
        emptyList()
      }
    // flat map là transform thành list rồi mới flatten
  }

fun main() {
  val list = listOf(1, 12, 22, 31)
  list.filter { it.toString().contains("2") } eq
    listOf(12, 22)
}