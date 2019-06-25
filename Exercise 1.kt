import java.util.Scanner
fun main(args: Array<String>) {
    print("Enter Name: ")
    val scan1= Scanner(System.`in`)
    val name= scan1.nextLine()
    print("Enter Age: ")
    val scan2= Scanner(System.`in`)
    val age= scan2.nextLine()
    println("Name: $name\nAge: $age")
}
