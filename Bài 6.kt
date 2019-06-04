import java.util.Scanner

fun main(args: Array<String>) {
    val n: Int
    var sothuN = 1
    var f0 = 1
    var f1 = 1
    val input = Scanner(System.`in`)
    println("Hãy nhập số n bất kì: ")
    n = input.nextInt()
    if (n > 1) {
        for (i in 2..n) {
            sothuN = f0 + f1
            f0 = f1
            f1 = sothuN
        }
    }
    println("Số Fibonacci thứ $n là $sothuN")
}