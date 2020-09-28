import java.util.Scanner

fun isVowel(checkChar: Char): Boolean{
    val vowelChars = "aeiou"
    vowelChars.forEach {
        if (it == checkChar.toLowerCase()) {
            return true
        }
    }
    return false
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}
