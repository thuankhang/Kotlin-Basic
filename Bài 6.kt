import java.util.Scanner

fun main(args: Array<String>) {
    val n: Int
    var number = 1
    var f0 = 1
    var f1 = 1
    val input = Scanner(System.`in`)
    print("Input any number: ")
    n = input.nextInt()
    if (n > 1) {
        for (i in 2..n) {
            number = f0 + f1
            f0 = f1
            f1 = number
        }
    }
    print("The $n")
    println("th Fibonacci number is $number")
}