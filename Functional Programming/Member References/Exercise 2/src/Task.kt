// MemberReferences/Task2.kt
package memberReferencesExercise2
import atomictest.eq

data class Student(
  val firstName: String,
  val lastName: String,
  val grade: Int
) {
  override fun toString(): String {
    return "$firstName $lastName ($grade)"
  }
}

fun List<Student>.sortByGradeAndThenByName(): List<Student> = sortedWith(
  compareByDescending(Student::grade)
    .thenBy(Student::lastName)
    .thenBy(Student::firstName))

fun main() {
  val people = listOf(
    Student("Alice", "Johnson", 1),
    Student("Bob", "Smith", 2),
    Student("Charlie", "Smith", 2))

  people.sortByGradeAndThenByName() eq
    "[Bob Smith (2), Charlie Smith (2), " +
    "Alice Johnson (1)]"
}
