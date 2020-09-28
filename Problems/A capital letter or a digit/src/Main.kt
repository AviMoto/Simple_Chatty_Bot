import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputChar = scanner.next().first()

    println(inputChar.isUpperCase() || inputChar.isDigit() && inputChar.toInt() in 49..58)
}
