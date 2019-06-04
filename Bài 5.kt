import java.util.Scanner
private val scanner = Scanner(System.`in`)

/*
 *
 * main
 *
 * @param args
 */

fun main(args: Array<String>) {
    print("Nhập n = ")
    val n = scanner.nextInt()
    System.out.printf("%d số nguyên tố đầu tiên là: \n", n)
    var dem = 0 // đếm số số nguyên tố
    var i = 2   // tìm số nguyên tố bắt dầu từ số 2
    while (dem < n) {
        if (isPrimeNumber(i)) {
            print("$i ")
            dem++
        }
        i++
    }
}

/*
 *
 * check so nguyen to
 *
 * @author viettuts.vn
 * @param n: so nguyen duong
 * @return true la so nguyen so,
 * false khong la so nguyen to
 */
fun isPrimeNumber(n: Int): Boolean {
    // so nguyen n < 2 khong phai la so nguyen to
    if (n < 2) {
        return false
    }
    // check so nguyen to khi n >= 2
    val squareRoot = Math.sqrt(n.toDouble()).toInt()
    for (i in 2..squareRoot) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}