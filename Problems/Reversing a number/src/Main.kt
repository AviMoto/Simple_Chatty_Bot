import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val readInt = scanner.nextInt()
    val handreds = (readInt / 100).toInt()
    val thens = ((readInt - handreds * 100) / 10).toInt()
    val ones = (readInt - handreds * 100 - thens * 10).toInt()

    println(ones * 100 + thens * 10 + handreds)
}
