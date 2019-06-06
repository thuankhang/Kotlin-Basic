import java.util.*

fun main(args: Array<String>) {
    Input()
}

internal fun Input() {
    val number1: Int
    val number2: Int
    val sc = Scanner(System.`in`)
    print("Input the Natural numbers (number1) : ")
    number1 = sc.nextInt()
    print("Input the Base system (number2) : ")
    number2 = sc.nextInt()
    val str = Transfer(number1, number2)
    print("Value $number1 switching from system 10 to system $number2 is: ")
    Output(str)
}

internal fun Output(str: String) {
    for (i in 0 until str.length)
        print(str[str.length - i - 1])
    println("")
}

internal fun Transfer(number1: Int, number2: Int): String {
    var number = number1
    var str = ""
    var x = 0
    while (number > 0) {
        x = number % number2
        number /= number2
        if (number2 == 16) {
            if (x == 10) str += "A"
            if (x == 11) str += "B"
            if (x == 12) str += "C"
            if (x == 13) str += "D"
            if (x == 14) str += "E"
            if (x == 15) str += "F"
            if (0 <= x && x < 10) str += x
        } else
            str += x
    }
    return str
}
