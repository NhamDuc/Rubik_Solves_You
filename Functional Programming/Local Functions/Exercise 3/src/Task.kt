// LocalFunctions/Task3.kt
package localFunctionsExercise3
import atomictest.eq
import extensionlambdas.va

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var x = 0
    val add: (Int) -> Unit = { i -> x = i}
    val remove: () -> Int? = {
        if(x != 0) {
            val t = x
            x = 0
            t
        } else null
    }
    return Pair(add, remove)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}