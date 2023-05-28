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

    /*
    Задание № 8
     */

    println("Введите сумму вклада")
    var iContribution: String? = readLine()
    var  sContribution = iContribution.toString().toDouble()
    println("Введите длительность вклада в месяцах")
    var iTerm: String? = readLine()
    var sTerm = iTerm.toString().toInt()
    println("Введите ежемесячный процент по вкладу")
    var iPercent: String? = readLine()
    var sPercent = iPercent.toString().toDouble()

    var i = 0
    while (i != sTerm){
        i++
        var a = sContribution * sPercent * 0.01
        sContribution = sContribution + a
        println("За $i месяц вклад увеличится на $a")
        println("Итоговая сумма вклада $sContribution")
    }

    /*
    Задание № 9
     */

    var geography: Array<Array<String>> = Array(3,{ Array(3,{"o"}) })
    geography[0] = arrayOf("Россия", "Тайлан", "ОАЭ")
    geography[1] = arrayOf("Москва", "Бангкок", "Абу-Даби")
    geography[2] = arrayOf("Рубль", "Бат", "Дирхам")

   for (i in 0..2){
       for (j in 0..2){

           print(geography[j][i] + " ")

       }
        println()
   }

    /*
    Задание № 10
     */

    var listCities = ArrayList<String>()
    while (true) {
        println("1. Возможность ввести название города\n2. Возможность посмотреть в консоли список всех добавленных городов\n3. Возможность посмотреть список добавленных городов без повторений\n4. Выйти из программы")
        var example: String? = readLine()
        var number = example.toString().toInt()
        if (number == 1) {
            var exampleCity: String? = readLine()
            var city = exampleCity.toString()
            listCities.add(city)
        }

        if (number == 2){
            listCities.forEach(::println)
        }

        if (number == 3){
            var setCities = listCities.toSet().toList()
            setCities.forEach(::println)
        }

        if (number == 4) break
    }

    /*
    Задиние № 11
     */

    var offis : Map<Int, String> = mapOf(1 to "Боб Дилан", 2 to "Пол Маккартни", 3 to "Джон Ленон", 4 to "Джими Хендрикс", 5 to "Витя Пупкин")
    println("Введите номер места и узнайте кто его занимает\nМест в фоисе 5")
    var example: String? = readLine()
    var number = example.toString().toInt()
    println(offis.get(number))




}