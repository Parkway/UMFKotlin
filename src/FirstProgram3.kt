fun main(args: Array<String>) {
    println("Hello out there.\n" +
            "I will add three numbers for you.\n" +
            "Enter three whole numbers.")
    val firstNum = readLine()!!.toInt()
    val secondNum = readLine()!!.toInt()
    val thirdNum = readLine()!!.toInt()
    val sum = firstNum + secondNum + thirdNum
    println("The sum of those three numbers is $sum.")
}