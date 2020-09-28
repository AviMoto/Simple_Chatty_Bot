import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstStartRange = scanner.nextInt()
    val firstEndRange = scanner.nextInt()
    val secondStartRange = scanner.nextInt()
    val secondEndRange = scanner.nextInt()
    val inputNumber = scanner.nextInt()

    println(inputNumber in firstStartRange..firstEndRange || inputNumber in secondStartRange..secondEndRange)
}
