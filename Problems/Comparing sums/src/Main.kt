import java.util.*

fun isGreater(firstNum: Int, secondNum: Int, thirdNum: Int, fourthNum: Int): Boolean {
    return firstNum + secondNum > thirdNum + fourthNum
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}
