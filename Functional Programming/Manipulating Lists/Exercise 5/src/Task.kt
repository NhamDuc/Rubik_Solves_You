// ManipulatingLists/Task5.kt
package manipulatingListsExercise5
import atomictest.eq

fun <T, R> List<T>.flatMap(f: (T) -> List<R>): List<R> {
  val listOfList = this.map { f(it) }.flatten() // map mỗi phần tử thành một list rồi mới flatten()
  return listOfList
}


fun main() {
  val list = listOf(3, 1, 4)

  list.flatMap { (0..it).toList() } eq
    listOf(0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4)
}