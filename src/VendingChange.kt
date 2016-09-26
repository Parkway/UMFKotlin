fun main(args: Array<String>) {
    println("Enter price of an item, from ¢25 to $1, in five cent increments.")
    val price = readLine()!!.toInt()
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