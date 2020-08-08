import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine().toLowerCase()
    var a = 1
    var b = 2
    var conter = 0
    val tabNum = IntArray(word.length)
    for (i in word) {
            if (i == 'a' || i == 'e' || i == 'o' || i == 'u' || i == 'y' || i == 'i') {
                a = 1
            } else {
                a = 2
            }
        tabNum[conter] = a
        conter++
    }
    var conter2 = -1
    var result = 0
    for (j in tabNum) {
        conter2++
        if (conter2 >= 2 && conter2 <= tabNum.size - 1) {
            if(3 == tabNum[conter2] + tabNum[conter2 - 1] + tabNum[conter2 - 2] || 6 == tabNum[conter2] + tabNum[conter2 - 1] + tabNum[conter2 - 2]) {
                result++
                conter2+=1
            }
        }
    }
    println(result)
}