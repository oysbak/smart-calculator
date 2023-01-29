package calculator

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }
    println(numbers[0] + numbers[1])
}
