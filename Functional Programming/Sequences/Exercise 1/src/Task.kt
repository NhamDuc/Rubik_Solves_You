// Sequences/Task1.kt
package sequencesExercise1

fun School.commonLessons(
  instructor: Instructor,
  student: Student
): Sequence<Lesson> {
  return this.lessons
    .filter { lesson ->
      lesson.instructor == instructor
    }
    .filter { lesson ->
      lesson.students.contains(student)
    }
}