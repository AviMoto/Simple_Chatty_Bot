import java.util.Scanner

fun sum(firstNum: Int, secondNum: Int, thirdNum: Int) = firstNum + secondNum + thirdNum

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}
