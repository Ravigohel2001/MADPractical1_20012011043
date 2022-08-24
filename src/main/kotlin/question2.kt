fun main(){
    var a: Int  = 10
    println("Integer value : $a")

    var b: Double = a.toDouble()
    println("Double value (From Integer) : $b")

    val c: String = "10"
    println("String value : $c")

    var d :Int = c.toInt()
    println("Integer value (From String) : $d")

    var e : Double = c.toDouble()
    println("Double value (From String) : $e")
}
