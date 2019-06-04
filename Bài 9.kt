package Bài9

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
                println("Ban phai nhap so! hay nhap lai...")
                input.nextLine()
            }

        }
        return n
    }

    fun tongChuSo(n: Int): Int {
        var n = n
        var T = 0
        while (n > 0) {
            T += n % 10
            n /= 10
        }
        return T
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

    fun phanTich(n: Int) {
        var n = n
        var i = 2
        while (n > 0) {
            if (n % i == 0) {
                if (n == i) {
                    print(i)
                    break
                } else
                    print("$i*")
                n /= i
            } else
                i++
        }
    }
    fun main(args: Array<String>) {
        print("Nhập n")
        val n = nhap()
        print("Phân tích n thành các thừa số nguyên tố: $n = 1*")
        phanTich(n)
        println()
        println("Tổng các chứ số của " + n + " là: " + tongChuSo(n))
    }
