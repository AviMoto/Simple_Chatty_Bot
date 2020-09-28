import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numberOfElements = scanner.nextInt()

    var sum = 0
    repeat(numberOfElements) {
        sum += scanner.nextInt()
    }
    println(sum)
}
