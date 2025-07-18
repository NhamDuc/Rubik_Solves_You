// BuildingMaps/Task1.kt
package buildingMapsExercise1
import atomictest.eq

data class Person(val name: String, val age: Int)

fun demographic(people: List<Person>): Map<Int, List<String>> {
   val groupes = people.groupBy { it.age }
    val map = groupes.mapValues { (_, v) ->
        v.map { it.name }
    }
    return map
}

fun main() {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))

  demographic(people) eq
    mapOf(21 to listOf("Alice"),
      25 to listOf("Bob", "Charlie"))
}