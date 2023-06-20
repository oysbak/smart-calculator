package calculator

class Calculator(input: String) {
    private val array = input.split(" ")
    val result: Int
    
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
        result = product
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