fun main(args: Array<String>) {
    var n:Int=0
    var s:String?
    println("Nhập số n:")
    s= readLine()
    if(s!=null)
        n=s.toInt()
    var dem:Int=0
    for(i in 1..n) {
        if(n%i==0)
            dem++
    }
    if(dem==2)
            println("$n là số nguyên tố")
    else
            println("$n ko phải là số nguyên tố")



}