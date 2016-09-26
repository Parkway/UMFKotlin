import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("Enter price of an item, from ¢25 to $1, in five cent increments.")
    val price = readLine()!!.toInt()
    if (price > 100) {
        println("Price is higher than $1. Not in range.")
        exitProcess(0)
    } else if (price < 25) {
        println("Price is less than ¢25. Not in range.")
        exitProcess(0)
    } else if (price % 5 != 0) {
        println("This is not an increment of 5.")
        exitProcess(0)
    } else {
        var amount = 100 - price
        val quarters = amount / 25
        amount %= 25
        val dimes = amount / 10
        amount %= 10
        val nickels = amount / 5
        amount %= 5

        println("You bought an item for $price cents, and gave me a dollar.\nYour change is\n"
                + "$quarters quarters,\n"
                + "$dimes dimes, and\n"
                + "$nickels nickels.")
    }
}