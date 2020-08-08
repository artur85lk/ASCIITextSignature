import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val wordsArray: Array<String> = text.split(scanner.next()).toTypedArray()
    var counter = 0
    for (i in wordsArray){
        counter++
    }
    println(counter - 1)
}