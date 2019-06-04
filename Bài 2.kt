import java.util.*

fun main() {
    val scanner  = Scanner(System.`in`)
    println("Số a là : ")
    val a=scanner.nextInt()
    println("Số b là : ")
    val b=scanner.nextInt()
    var ucscln=1
    var min=if (a>b) b else a
    for (i in min downTo 1)
    {
        if(a%i==0 && b%i==0)
        {
            ucscln=i
            break
        }
    }
    println("USCL của $a và $b (a và b) = $ucscln")

}