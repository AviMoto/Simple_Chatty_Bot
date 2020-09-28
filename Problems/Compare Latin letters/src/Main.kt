import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstLetter = scanner.next().first().toLowerCase()
    val secondLetter = scanner.next().first().toLowerCase()

    println(firstLetter == secondLetter)
}
