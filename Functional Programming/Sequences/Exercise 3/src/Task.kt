// Sequences/Task3.kt
package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double {
  val ratingValues = this.lessons
    .filter { it.instructor == instructor } // lesson with that instructor
    .map { it.rating } // map each lesson to its rating
    .map { it.values }.flatten() // extract values then flat all the ratings

  val ratingCount = ratingValues.count()

  if (ratingCount == 0) {
    return 0.0
  }

  val sumRating = ratingValues.fold(0.0) {acc, i ->
    acc + i
  }

  return sumRating / ratingCount
}
