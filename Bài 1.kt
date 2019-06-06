fun main(args: Array<String>) {
    var number:Int=0
    var s:String?
    println("Input number :")
    s= readLine()
    if(s!=null)
        number=s.toInt()
    var count:Int=0
    for(i in 1..number) {
        if(number%i==0)
            count++
    }
    if(count==2)
            println("$number is a prime number ")
    else
            println("$number isn't a prime number")



}