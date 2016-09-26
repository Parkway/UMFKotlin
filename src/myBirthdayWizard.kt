fun main(args: Array<String>) {
    println("Greetings\nWhat year were you born?")
    val birthYear = readLine()!!.toInt()
    println("Now pick a year. Any year.")
    val selectedYear = readLine()!!.toInt()
    val math = selectedYear - birthYear
    println("In the year $selectedYear, you were, or will be $math")
}