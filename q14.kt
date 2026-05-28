fun main() {
    val n = 50

    println("Prime numbers from 1 to $n are:")

    for (i in 2..n) {
      var isPrime = true

        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            println(i)
        }
    }
}
