package calculator

class UserInput(val inputString: String) {
    private val input = inputString.trim()
    private val comRegex = "/[a-z]+".toRegex()
    private val expRegex = "[+\\-]*\\d+[+\\-\\s\\d]*\\d".toRegex()
    val command: Command

    init {
        //skrivUt(input)
        command = if (comRegex.matches(input)) {
            getCommand(input)
        } else if (expRegex.matches(input)) {
            Command.CALCULATE
        } else {
            Command.INVALID
        }

    }

    private fun getCommand(commandString: String): Command {
        return when (commandString) {
            "/exit" -> Command.EXIT
            "/help" -> Command.HELP
            else -> Command.UNKNOWN
        }
    }
}