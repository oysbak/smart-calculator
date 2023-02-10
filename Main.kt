package calculator

fun main() {
    do {
        when (val userInput = readln()) {
            "" -> {
                // do nothing
            }
            
            "/exit" -> {
                println("Bye!")
                return
            }
            
            "/help" -> {
                println("The program calculates the sum of numbers")
            }
            
            else -> {
                println(Calculator.sum(userInput.split(" ").map { it.toInt() }))
            }
        }
    } while (true)
}

class Calculator {
    companion object {
        fun sum(numbers: List<Int>): Int = numbers.sum()
    }
}
