// Sequences/Task2.kt
package sequencesExercise2

fun School.studentInstructors(
  student: Student
): Set<Instructor> {
  val list = this.lessons.filter {
    it.students.contains(student)
  }
  return list.map { it.instructor }.toSet()
}

fun School.studentsOf(
  instructor: Instructor
): Set<Student> {
  val lessonsHasSameInstructor = this.lessons.filter {
    it.instructor == instructor
  }
    val studentsOfLessons = lessonsHasSameInstructor.map { it.students }.flatten()
  return studentsOfLessons.toSet()
}