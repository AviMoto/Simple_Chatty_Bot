import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputInt = scanner.nextInt()

    val tens = inputInt % 100
    println(tens / 10)
}
