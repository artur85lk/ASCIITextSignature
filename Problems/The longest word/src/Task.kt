import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val wordsArray: Array<String> = text.split(" ").toTypedArray()
    var max: String = ""
    for (i in wordsArray) {
        for (j in wordsArray) {
                if (i.length > max.length)
                   max = i
            }
    }
    println(max)
}