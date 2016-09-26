fun main(args: Array<String>) {
    println("Enter the first string:")
    val firstString = readLine()
    val firstLength = firstString!!.length
    println("Enter the second string:")
    val secondString = readLine()
    val secondLength = secondString!!.length
    val concat = firstString + " " + secondString
    val concatLength = concat.length
    println("The first string is '$firstString', and it is $firstLength characters long.\n" +
    "The second string is '$secondString', and it is $secondLength characters long.\n" +
    "When combined, you get '$concat', with a total length of $concatLength characters.")
}