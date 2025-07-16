// BuildingMaps/Task3.kt
package buildingMapsExercise3
import atomictest.eq
import exceptionhandling.checkValue

fun <T, R> List<T>.associateBy(keySelector: (T) -> R): Map<R, T> =
  groupBy(keySelector).mapValues { (_, v) ->
    v.last()
  }



data class Person(val name: String, val age: Int)

fun main() {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))

  people.associateBy(Person::name) eq
    "{Alice=Person(name=Alice, age=21), " +
    "Bob=Person(name=Bob, age=25), " +
    "Charlie=Person(name=Charlie, age=25)}"
}