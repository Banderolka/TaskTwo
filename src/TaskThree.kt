import kotlin.math.sqrt

fun main (args: Array<String>) {
    /*
    Задание № 12
     */

    fun determineLeapYear (year: Int){
        if (year % 4 == 0 ) println("$year - високосный год")
        else println("$year - не високосный год")
    }

    println("Введите год")
    var userEnter: String? = readLine()
    var number: Int = userEnter.toString().toInt()

    determineLeapYear(number)

    /*
    Задание № 13
     */

    fun returnQuantityEmployees (vararg employees: String){
        var result = 0
        for (n in employees){
            result++
        }

        println("Сотрудников всего $result")
    }

    /*
    Задание № 14
     */

    fun employeeInformation (fullName: String, jobTitle: String){
        println("ФИО - $fullName\nДолжность - $jobTitle")
    }

    fun employeeInformation (fullName: String, age: Int, jobTitle: String){
        println("ФИО - $fullName\nВозвраст - $age\nДолжность - $jobTitle")
    }

    fun employeeInformation(fullName: String, familyStatus: String, jobTitle: String){
        println("ФИО - $fullName\nСемейное положение - $familyStatus\nДолжность - $jobTitle")
    }

    fun employeeInformation (fullName: String, age: Int, familyStatus: String, jobTitle: String){
        println("ФИО - $fullName\nВозвраст - $age\nСемейное положение - $familyStatus\nДолжность - $jobTitle")
    }

    /*
    Задание № 15
     */

    val str = {x: Array<String> -> println(x.contentToString())}

    /*
    Задание № 16
     */

    fun Double.squareRoot(): Double {
        return sqrt(this)
    }

}