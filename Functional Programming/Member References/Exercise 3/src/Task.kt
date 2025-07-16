// MemberReferences/Task3.kt
package memberReferencesExercise3
import atomictest.eq
import creatinggenerics.items
import kotlin.math.sqrt

val Int.isEven: Boolean
  get() = this % 2 == 0

// Returns all the divisors of the number
// except 1 and the number itself
private fun getNonTrivialDivisors(num: Int): List<Int> {
  val x = mutableListOf<Int>()
  for (i in 1.until(num)) {
    if (num % i == 0)
      x.add(i)
  }
  return x.toList()
}

fun Int.isPrime(): Boolean {
  if (this <= 1) {
    return false
  }

  for (i in 2..sqrt(this.toDouble()).toInt()) {
    if (this % i == 0)
      return false
  }

  return true
}

fun isPerfect(num: Int): Boolean {
  return getNonTrivialDivisors(num).sum() == num
}

fun main() {
  val range = 1..1000
  val even = range.filter({it.isEven})
  even.size eq 500

  val prime = range.filter({it.isPrime()})
  prime.take(7) eq listOf(2, 3, 5, 7, 11, 13, 17)
  prime.takeLast(7) eq
    listOf(953, 967, 971, 977, 983, 991, 997)

  val perfect = range.filter(TODO())
  perfect eq listOf(6, 28, 496)
  // 6 = 1 + 2 + 3
  // 28 = 1 + 2 + 4 + 7 + 14
}