import java.util.Scanner
private val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    print("Input number n = ")
    val n = scanner.nextInt()
    System.out.printf("The first %d prime number are: \n", n)
    var count = 0
    var i = 2
    while (count < n) {
        if (isPrimeNumber(i)) {
            print("$i ")
            count++
        }
        i++
    }
}

fun isPrimeNumber(n: Int): Boolean {
    if (n < 2) {
        return false
    }
    val squareRoot = Math.sqrt(n.toDouble()).toInt()
    for (i in 2..squareRoot) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}