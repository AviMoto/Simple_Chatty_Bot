import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstChar = scanner.next().first()
    val secondChar = scanner.next().first()
    val theerdChar = scanner.next().first()
    val fourthChar = scanner.next().first()

    println(firstChar.isDigit().toString() + "\\" + secondChar.isDigit() + "\\" + theerdChar.isDigit() + "\\" +
        fourthChar.isDigit())
}
