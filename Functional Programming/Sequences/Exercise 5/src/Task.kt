// Sequences/Task5.kt
package sequencesExercise5

fun School.instructorsWithLargestClass(): Set<Instructor> {
  val maximum = this.lessons.map { it.students.size }.maxOrNull()

  if (maximum == null) return emptySet()

  return this.lessons
    .filter {
      it.students.size == maximum
    }.map {
      it.instructor
    }.toSet()
}