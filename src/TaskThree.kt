fun main (args: Array<String>) {


    fun determineLeapYear (year: Int){
        if (year % 4 == 0 ) println("$year - високосный год")
        else println("$year - не високосный год")
    }

    println("Введите год")
    var userEnter: String? = readLine()
    var number: Int = userEnter.toString().toInt()

    determineLeapYear(number)
}