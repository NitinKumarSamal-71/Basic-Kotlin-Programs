fun sumOfNumbers(n: Int): Int {
    var sum = 0

    // Add numbers from 1 to n
    for (i in 1..n) {
        sum += i
    }

    return sum
}

fun main() {
    val n = 10
    println("Sum = ${sumOfNumbers(n)}")
}
