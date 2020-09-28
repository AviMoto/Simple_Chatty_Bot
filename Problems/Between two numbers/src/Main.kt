import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val threedNumber = scanner.nextInt()

    println(firstNumber in secondNumber..threedNumber)
}
