fun main(args: Array<String>){

    /*
    Задание № 7
     */
    var count = 0
    println("Сколько планет в солнечной системе?\n1.Восемь\n2.Девять")
    var userEnter: String? = readLine()
    var answer: Int = userEnter.toString().toInt()
    if (answer == 1) count = count + 1

    println("Каая самая большая планета солнечной системы?\n1.Уран\n2.Юпитер")
    var userEnter1: String? = readLine()
    answer = userEnter1.toString().toInt()
    if (answer == 2) count = count + 1

    println("Солнечная система в какую галактику входит?\n1.Млечный путь\n2.Сникерс")
    var userEnter2: String? = readLine()
    answer = userEnter2.toString().toInt()
    if (answer == 1) count = count + 1

    println("Плутон планета?\n1.Да\n2.Нет")
    var userEnter3: String? = readLine()
    answer = userEnter3.toString().toInt()
    if (answer == 2) count = count + 1

    println("Какая планета расположена ближе всех к Земле?\n1.Марс\n2.Венера")
    var userEnter4: String? = readLine()
    answer = userEnter4.toString().toInt()
    if (answer == 2) count = count + 1
    println(count)

    when(count){
        0 -> println("Вы не ответили ни на один вопрос.")
        1 -> println("Вы ответили на один вопрос.")
        2 -> println("Вы ответили на два вопроса.")
        3 -> println("Вы ответили на три вопроса.")
        4 -> println("Вы ответили на четыре вопроса.")
        5 -> println("Вы ответили на все вопросы, вы - молодец!")
    }





}