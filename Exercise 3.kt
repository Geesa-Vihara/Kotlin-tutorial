fun main(args: Array<String>) {
    print("Enter a string: ")
    var str = readLine()!!
    for (i in 0..(str.length-1) step 2) print(str[i])


}