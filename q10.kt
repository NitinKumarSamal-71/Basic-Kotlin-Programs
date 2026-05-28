fun checkCharacter(ch: Char) {

    if (ch == 'a' || ch == 'e' || ch == 'i' ||
        ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' ||
        ch == 'O' || ch == 'U') {

        println("$ch is a Vowel")
    } else {
        println("$ch is a Consonant")
    }
}

fun main() {
    checkCharacter('A')
}
