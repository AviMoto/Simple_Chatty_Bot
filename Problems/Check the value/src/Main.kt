import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputNumber = scanner.nextInt()

    println(inputNumber in 1..9)
}
