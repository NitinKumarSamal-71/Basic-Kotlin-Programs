fun main() {
    var num = 12345
    var reverse = 0

    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }

    println("Reversed Number = $reverse")
}
