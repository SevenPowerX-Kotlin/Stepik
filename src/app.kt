/**
 * Первая программа на Kotlin в IntelliJ IDEA
 * https://metanit.com/kotlin/tutorial/1.2.php
 */

fun main(args: Array<String>) {
    println("Hello Kotlin")

    /**
     * Объявление переменной
     * Переменная может быть неизменямой (immutable) и изменяемой (mutable).
     * Неизменяемые переменные объявляются ключевым словом val (value, значение).
     * Изменяемые переменные объявляются словом var (variable, переменная).
     * Тип данных может быть указан явно или неявно.
     * Тип указывается явно при создании переменной через символ `:` (явное указание)
     */
    var a = ""
    val b = ""

    a = "Hello!" //Ok
    // b = "Hello!" // Compilation Error
    println(a)
    println(b)
    //Явно указываем тип

    var strOne: String  //строка
    var i: Int           //целое число (Int)
    var d: Double        // Double

    // println(i)  //коментарий Error неинициалезированая переменная
    // println(d)  //comment two Error неинициалезированая переменная

    // (неявное указание)

    var strTwo = ""     // string
    var iTwo = 1            //Int
    var dTwo = 4.5         // Double

    println(strTwo)
    println(iTwo)
    println(dTwo)

    /* Этот коментарий
      является мн
      многострочным */

    /*
     * Красивый
     * многострочный
     * коментарий
     */

    /************************************
     * Что-то похожее на таблицу        *
     * **********************************
     * data *   Name    *   City        *
     ************************************/

    println("Hello")

    println(/*Коментарий внутрений*/"Hello Kotlin!!!")


}
//TODO-splaa: Продолжить Stepik 1.2 Ввод и вывод
//
//todo-splaa: Перейти к Глава 2.Основы языка Kotlin. Переменные https://metanit.com/kotlin/tutorial/2.1.php
//todo-splaa: Изучить  [Руководство по языку Kotlin](https://kotlinlang.ru/)