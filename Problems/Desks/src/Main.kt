import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val group1 = scanner.nextInt()
    val group2 = scanner.nextInt()
    val group3 = scanner.nextInt()

    println(Math.ceil(
        group1.toDouble() / 2).toInt() +
        Math.ceil(group2.toDouble() / 2).toInt() +
        Math.ceil(group3.toDouble() / 2).toInt()
    )
}
