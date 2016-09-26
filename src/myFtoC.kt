fun main(args: Array<String>) {
    intro()
}
fun intro() {
    println("Would you like to convert\n"
    + "Fahrenheit to Celsius, or\n"
    + "Celsius to Fahrenheit?")
    val conversionType = readLine()!!.toLowerCase()
    if (conversionType == "fahrenheit to celsius") {
        FtoC()
    } else if (conversionType == "celsius to fahrenheit") {
        CtoF()
    } else {
        println("That is not an option. Please enter \"Fahrenheit to Celsius\" or \"Celsius to Fahrenheit\".")
    }
}
fun FtoC() {
    println("Please enter the temperature you wish to convert.")
    val Ftemp = readLine()!!.toDouble()
    val Ctemp = (Ftemp - 32) * 5/9
    println("$Ftemp°F is $Ctemp°C.")
}
fun CtoF() {
    println("Please enter the temperature you wish to convert.")
    val Ctemp = readLine()!!.toDouble()
    val Ftemp = (Ctemp * 9/5) + 32
    println("$Ctemp°C is $Ftemp°F")
}