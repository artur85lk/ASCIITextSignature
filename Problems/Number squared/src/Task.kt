import java.util.*

fun square(number: Int):Int{
    val x = number * number
    return x
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))

}
