// ManipulatingLists/Task4.kt
package manipulatingListsExercise4
import atomictest.eq
import manipulatingListsExercise6.flatten

class Person(
  val name: String
) {
  val friends: MutableList<Person> = mutableListOf()

  override fun toString() = "($name, friends: ${friends.map { it.name }})"
}

fun friendSuggestions(person: Person): Set<Person> {
  val name = person.friends.map { it.friends }.flatten().toSet() - person - person.friends
 // Friend of this person
//  val friends = person.friends
//  val friendsOfFriends = friends.flatMap { it -> it.friends }.toMutableList()
//  friendsOfFriends.removeAll(listOf(person))
//  friendsOfFriends.removeAll(friends)
//  return friendsOfFriends.toSet()
  return name
}

fun main() {
  val alice = Person("Alice")
  val bob = Person("Bob")
  val charlie = Person("Charlie")

  alice.friends += bob
  bob.friends += alice
  bob.friends += charlie
  charlie.friends += bob

  friendSuggestions(alice) eq setOf(charlie)
}