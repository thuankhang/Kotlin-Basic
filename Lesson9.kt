import java.util.*

fun Analysis1(n: Int) {
    var number = n
    var i = 2
    while (number > 0) {
        if (number % i == 0) {
            if (number == i) {
                print(i)
                break
            } else
                print("$i*")
            number /= i
        } else
            i++
    }
}

internal fun Total1(n: Int): Int {
    var number = n
    var tg = 0
    while (number > 0) {
        tg += number % 10
        number /= 10
    }
    return tg
}


fun main(args: Array<String>) {
    print("Input any number: ")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println("Sum the digits of n is: " + Total1(n))
    print("Analyze n into prime excess numbers: ")
    Analysis1(n)
    println("")
}