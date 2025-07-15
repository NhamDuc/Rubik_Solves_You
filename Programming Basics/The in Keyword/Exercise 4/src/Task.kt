// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
  if(s.isEmpty()) return false

  for (it in s) {
    if (!(it in 'A'..'Z' || it in 'a'..'z' || it == '_' || it in '0'..'9')) {
      return false
    }
  }

  return s.first().run {
    this in 'A'..'Z' || this in 'a'..'z' || this == '_'
  }
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}