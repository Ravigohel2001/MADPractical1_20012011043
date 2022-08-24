fun main(){
    print("Enter enroll no:")
    var en= readLine()!!.toLong()

    print("Enter student name:")
    var name= readLine()

    print("Enter Branch: ")
    var branch = readLine()

    print("Enter Class: ")
    var cls = readLine()

    print("Enter Batch: ")
    var bch = readLine()

    print("Enter College Name: ")
    var clg_name = readLine()

    print("Enter University Name: ")
    var uni_name = readLine()

    print("Enter Age: ")
    var age = readLine()!!.toInt()

    println()
    println("***********************")
    println()
    println("Students Data:")
    println("Enrollment N0.: $en")
    println("Name: $name")
    println("Age: $age")
    println("Branch: $branch")
    println("Class: $cls")
    println("Batch: $bch")
    println("College Name: $clg_name")
    println("University Name: $uni_name")
}