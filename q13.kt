fun calculateSI(principal: Double, rate: Double, time: Double): Double {

    return (principal * rate * time) / 100    // SI=P*R*T/100
}

fun main() {
    val principal = 5000.0
    val rate = 5.0
    val time = 2.0

    val si = calculateSI(principal, rate, time)

    println("Simple Interest = $si")
}
