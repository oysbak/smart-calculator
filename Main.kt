package calculator

fun main() {
    do {
        print("> ")
        val userInput = UserInput(readln())
        when (userInput.command) {
            Command.CALCULATE -> {
                println(Calculator(userInput.inputString).result)
            }
            Command.EXIT -> {
                println("Bye!")
            }
            Command.HELP -> {
                println("This is the help page...")
            }
            Command.INVALID -> {
                println("Invalid expression")
            }
            Command.UNKNOWN -> {
                println("Unknown command")
            }
        }
    } while (userInput.command != Command.EXIT)
}

fun String.removeWhitespaces() = filter { !it.isWhitespace() }

fun display(expression: String) {
    println("\"${expression}\"")
}


