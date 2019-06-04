package Bài7

import java.util.Scanner


fun nhap(): Int {
    val input = Scanner(System.`in`)
    var check = false
    var n = 0
    while (!check) {
        print(" ")
        try {
            n = input.nextInt()
            check = true
        } catch (e: Exception) {
            println("Bạn phải nhập số! Hãy nhập lại...")
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
    print("Nhập n= ")
    val n = nhap()
    val f = IntArray(n)
    f[0] = 1
    f[1] = 1
    var i = 1
    var count = 1
    print("Các số Fibonanci nhỏ hơn $n là số nguyên tố là: \n 1")
    while (f[i] < n) {
        if (checkSNT(f[i])) {
            print(" " + f[i])
            count++
        }
        i++
        f[i] = f[i - 1] + f[i - 2]
    }
    println("\n Có $count số thỏa mãn")
}
