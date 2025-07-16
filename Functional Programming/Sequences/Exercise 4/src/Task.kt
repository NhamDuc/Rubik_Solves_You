// Sequences/Task4.kt
package sequencesExercise4

fun School.favoriteInstructor(student: Student): Instructor? {
  val lessonHasThisStudent =
    this.lessons
      .filter {
        it.students.contains(student)
      }

  val instructorRatings = lessonHasThisStudent.mapNotNull { lesson ->
    val studentRating = lesson.rating[student] // rating of that student for this lesson
    val lessonInstructor = lesson.instructor

    if (studentRating != null)
      studentRating to lessonInstructor
    else
      null
  }

  return instructorRatings.maxByOrNull { it.first }?.second
}
