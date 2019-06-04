import java.util.*

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

internal fun tong(n: Int): Int {
    var n = n
    var tg = 0
    while (n > 0) {
        tg += n % 10
        n /= 10
    }
    return tg
}


fun main(args: Array<String>) {
    println("Nhập 1 số tự nhiên bất kỳ:")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println("Tổng các chữ số của n = " + tong(n))
    print("Phân tích n thành các thừa số nguyên tố: ")
    phanTich(n)
    println("")
}