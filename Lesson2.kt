import java.util.*

fun main() {
    val scanner  = Scanner(System.`in`)
    println("Input number a : ")
    val a=scanner.nextInt()
    println("Input number b : ")
    val b=scanner.nextInt()
    var The_largest_common_divisor =1
    var min=if (a>b) b else a
    for (i in min downTo 1)
    {
        if(a%i==0 && b%i==0)
        {
            The_largest_common_divisor=i
            break
        }
    }
    println("The greatest common divisor of $a and $b = $The_largest_common_divisor")

}