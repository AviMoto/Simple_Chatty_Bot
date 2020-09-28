import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var firstBoxX = scanner.nextInt()
    var firstBoxY = scanner.nextInt()
    var firstBoxZ = scanner.nextInt()
    var secondBoxX = scanner.nextInt()
    var secondBoxY = scanner.nextInt()
    var secondBoxZ = scanner.nextInt()

    if (firstBoxX > firstBoxY) {
        if (firstBoxX > firstBoxZ) {
            if (firstBoxZ > firstBoxY) {
                var c = firstBoxZ
                firstBoxZ = firstBoxY
                firstBoxY = c
            }
        } else {
            var c = firstBoxX
            firstBoxX = firstBoxZ
            firstBoxZ = firstBoxY
            firstBoxY = c
        }
    } else {
        var c = firstBoxX
        firstBoxX = firstBoxY
        firstBoxY = c
        if (firstBoxX < firstBoxZ){
            var c = firstBoxX
            firstBoxX = firstBoxZ
            firstBoxZ = firstBoxY
            firstBoxY = c
        } else if (firstBoxY < firstBoxZ) {
            var c = firstBoxZ
            firstBoxZ = firstBoxY
            firstBoxY = c
        }
    }

    if (secondBoxX > secondBoxY) {
        if (secondBoxX > secondBoxZ) {
            if (secondBoxZ > secondBoxY) {
                var c = secondBoxZ
                secondBoxZ = secondBoxY
                secondBoxY = c
            }
        } else {
            var c = secondBoxX
            secondBoxX = secondBoxZ
            secondBoxZ = secondBoxY
            secondBoxY = c
        }
    } else {
        var c = secondBoxX
        secondBoxX = secondBoxY
        secondBoxY = c
        if (secondBoxX < secondBoxZ){
            var c = secondBoxX
            secondBoxX = secondBoxZ
            secondBoxZ = secondBoxY
            secondBoxY = c
        } else if (secondBoxY < secondBoxZ) {
            var c = secondBoxZ
            secondBoxZ = secondBoxY
            secondBoxY = c
        }
    }

    if (firstBoxX == secondBoxX && firstBoxY == secondBoxY && firstBoxZ == secondBoxZ) {
        println("Box 1 = Box 2")
    } else if (firstBoxX >= secondBoxX && firstBoxY >= secondBoxY && firstBoxZ >= secondBoxZ) {
        println("Box 1 > Box 2")
    } else if (secondBoxX >= firstBoxX && secondBoxY >= firstBoxY && secondBoxZ >= firstBoxZ) {
        println("Box 1 < Box 2")
    } else {
        println("Incomparable")
    }
}
