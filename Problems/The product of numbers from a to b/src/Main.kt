import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    var product = 1.0
    for (num in a..b - 1) {
        product *= num
    }
    println("%.0f".format(product))
}
