import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numberOfElements = scanner.nextInt()

    var maxNumber = 0
    var inputNmber = 0
    repeat(numberOfElements){
        inputNmber = scanner.nextInt()
        if (inputNmber % 4 == 0 && inputNmber > maxNumber) {
            maxNumber = inputNmber
        }
    }
    println(maxNumber)
}
