import java.util.ArrayList

var DEC_10 = 10

fun main(args: Array<String>) {
    var count = 0
    println("Six-digit reversible numbers are: ")
    for (i in 100000..999999) {
        if (isReversible(i)) {
            println(i)
            count++
        }
    }
    println("There are $count number of reversible have six digits")
}


fun isReversible (n: Int): Boolean {
    var n = n
    val listNumbers = ArrayList<Int>()
    do {
        listNumbers.add(n % DEC_10)
        n = n / DEC_10
    } while (n > 0)
    val size = listNumbers.size
    for (i in 0 until size / 2) {
        if (listNumbers[i] !== listNumbers[size - i - 1]) {
            return false
        }
    }
    return true
}

