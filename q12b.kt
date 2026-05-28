fun main() {
    var a = 10
    var b = 20

    println("Before Swapping:")
    println("a = $a, b = $b")

    a = a + b
    b = a - b
    a = a - b

    println("After Swapping:")
    println("a = $a, b = $b")
}
