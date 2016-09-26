fun main(args: Array<String>) {
    var total: Double = 0.0
    var largest = Integer.MIN_VALUE
    var smallest = Integer.MAX_VALUE
    var count = 0
    println("This program allows you to enter a list of positive integers,\n" +
            "terminated by a -1, then displays the largest value,\n" +
            "smallest value, and average of the list of numbers,\n" +
            "not including the final negative value that ends the list.\n")
    while (true) {
        println("Please enter a positive integer, or -1 to quit.")
        val num = readLine()!!.toInt()
        if (num == -1) break
        count++
        total += num
        if (num > largest) largest = num
        if (num < smallest) smallest = num
    }
    val average = total / count
    println("For the $count numbers you entered,")
    println("The largest value = $largest")
    println("The smallest value = $smallest")
    println("The average value = $average")
}