fun main(args: Array<String>) {
    println("Please enter three words separated by spaces.")
    val threeWords = readLine()
    println(threeWords?.length)
    val words = threeWords!!.split(" ")
    print("The middle word is " + words[1])

}