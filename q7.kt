fun largest(a: Int, b: Int, c: Int): Int {

    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun main() {
    val result = largest(10, 25, 15)
    println("Largest Number = $result")
}
