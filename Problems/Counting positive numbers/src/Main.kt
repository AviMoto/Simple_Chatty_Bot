import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val iterations = scanner.nextInt()

    var numberOfPositive = 0
    var number = 0
    repeat(iterations) {
        number = scanner.nextInt()
        if (number > 0) {
            ++numberOfPositive
        }
    }

    println(numberOfPositive)
}
