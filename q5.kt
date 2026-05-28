fun main() {
    var num = 121
    val original = num
    var reverse = 0

    // Reverse the number
    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }

    // Compare original and reversed number
    if (original == reverse) {
        println("$original is a Palindrome")
    } else {
        println("$original is not a Palindrome")
    }
}
