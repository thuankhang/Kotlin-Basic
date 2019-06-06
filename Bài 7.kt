

import java.util.Scanner


fun Enter(): Int {
    val input = Scanner(System.`in`)
    var check = false
    var n = 0
    while (!check) {
        print(" ")
        try {
            n = input.nextInt()
            check = true
        } catch (e: Exception) {
            input.nextLine()
        }

    }
    return n
}

fun checkSNT(n: Int): Boolean {
    if (n > 1) {
        var i = 2
        while (i <= Math.sqrt(n.toDouble())) {
            if (n % i == 0) return false
            i++
        }
        return true
    } else
        return false
}
fun main(args: Array<String>) {
    print("Input number n= ")
    val n = Enter()
    val f = IntArray(n)
    f[0] = 1
    f[1] = 1
    var i = 1
    var count = 1
    print("The Fibonanci numbers are less $n and are prime numbers are : \n 1")
    while (f[i] < n) {
        if (checkSNT(f[i])) {
            print(" " + f[i])
            count++
        }
        i++
        f[i] = f[i - 1] + f[i - 2]
    }
    println("\n There are $count satisfied numbers")
}
