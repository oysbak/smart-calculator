package calculator

fun main() {
    do {
        when (val inputString = readln()) {
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
                UserInput(inputString)
            }
        }
    } while (true)
}

class UserInput(input: String) {
    private val array = input.split(" ")
    
    init {
        var product = 0
        var operation = '+'
        array.forEach {
            if (it.toIntOrNull() == null) {
                operation = extractSinglePrefiks(it)
            } else {
                product = calculate(product, it.toInt(), operation)
            }
        }
        println(product)
    }
    
    private fun calculate(x: Int, y: Int, operation: Char): Int {
        if (operation == '+')
            return x + y
        if (operation == '-')
            return x - y
        return 0
    }
    
    private fun extractSinglePrefiks(input: String): Char {
        var value = '+'
        input.forEach {
            value = prefix(value, it)
        }
        return value
    }
    
    private fun prefix(first: Char, second: Char): Char {
        return if (first == second) '+' else '-'
    }
}
