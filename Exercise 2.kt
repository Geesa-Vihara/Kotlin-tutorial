fun main(args: Array<String>) {
    print("Enter Numbers to Add: ")
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    var tot=0
    for (num in items) {
        tot += num
    }
    println("SUM: $tot")
}