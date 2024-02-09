import java.time.LocalDate

val CURRENT_YEAR = LocalDate.now().year
var birthYear = 0

fun calcAge(birthYear: Int): Int {
    return CURRENT_YEAR - birthYear
}

fun main() {

    do {
        println("What year were you born?")
        try {
            val userInput = readln().toInt()
            if (userInput >= 1900) {
                birthYear = userInput
            } else {
                println("Birth year must be at least 1900 \n")
            }
        } catch (exception: NumberFormatException) {
            println("Number not an integer \n")
        }
    } while (birthYear == 0)

    println("You turn ${calcAge(birthYear)} this year 🎉")
}