// HigherOrderFunctions/Task3.kt
package higherOrderFunctionsExercise3
import atomictest.eq

fun <T, R : Any> Iterable<T>.mapIndexedNotNull(
  transform: (Int, T) -> R?
): List<R> {
  val result = mutableListOf<R>()
  this.forEachIndexed { i, t ->
    val b = transform(i, t)
    if(b != null)
      result.add(b)
  }
  return result
}

fun main() {
  val list = listOf("a", "b", "c", "d")
  list.mapIndexedNotNull { index, s ->
    if (index % 2 == 0) "$s!" else null
  } eq listOf("a!", "c!")
}