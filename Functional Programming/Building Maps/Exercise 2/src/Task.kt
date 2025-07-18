// BuildingMaps/Task2.kt
package buildingMapsExercise2
import atomictest.eq

fun <T, R> List<T>.groupBy(keySelector: (T) -> R): Map<R, List<T>> {
  val map = mutableMapOf<R, MutableList<T>>()
  for(t in this) {
    val key = keySelector(t)
    val list = map.getOrPut(key) {mutableListOf()}
    list += t
  }
  return map
}

data class Person(val name: String, val age: Int)

fun main() {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))

  people.groupBy(Person::age) eq
    "{21=[Person(name=Alice, age=21)], " +
    "25=[Person(name=Bob, age=25), Person(name=Charlie, age=25)]}"
}