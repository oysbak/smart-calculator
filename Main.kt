package calculator

fun runCommand(userInput: UserInput) {
    when (userInput.input) {
        "/help" -> println("Help page")
        "/exit" -> println("Bye!")
        else -> println("Unknown command")
    }
}

fun main() {
    do {
        val userInput = UserInput(readln().trim())
        if (userInput.isCommand()) {
            runCommand(userInput)
        } else if (userInput.isValidExpression()) {
            Calculator(userInput.input)
        }
    } while (!userInput.doQuit)
}

class UserInput(val input: String) {
    val doQuit = input == "/exit"
    fun isCommand() = input.startsWith("/")

    fun isValidExpression(): Boolean {
        println(input.split("[0-9]".toRegex()))
        return true
    }
}

class Calculator(private val input: String) {
    private fun calculate(input: String): Int {
        println("Answer is ${input}")
        return 42
    }
}