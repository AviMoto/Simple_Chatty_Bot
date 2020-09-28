import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    for (i in 0..1000) {
        if (a * Math.pow(i.toDouble(), 3.0) + b * Math.pow(i.toDouble(), 2.0) + c * i + d == 0.0) {
            println(i)
        }
    }
}
