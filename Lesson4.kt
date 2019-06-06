import java.util.*

fun Analysis(n: Int) {
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

internal fun Total(n: Int): Int {
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
    println("Sum the digits of n is: " + Total(n))
    print("Analyze n into prime excess numbers: ")
    Analysis(n)
    println("")
}