const val JUST_NOW = 60
const val MINUTE = 3600
const val HOUR = 86400
const val DAY = 172800
const val YESTERDAY = 259200
const val OTHER = 100_000_000
const val NULL = 0


fun main() {
    while (true) {
        ago(JUST_NOW, MINUTE, HOUR, DAY, YESTERDAY, OTHER, NULL)
    }
}

fun ago(
    JUST_NOW: Int,
    MINUTE: Int,
    HOUR: Int,
    DAY: Int,
    YESTERDAY: Int,
    OTHER: Int,
    NULL: Int) {
    print("Введите кол-во секунд, проведенные пользователем: ")
    val second = readLine()?.toInt() ?: return
    val result = if (second < 0) NULL
    else if (second < JUST_NOW) JUST_NOW
    else if (second < MINUTE) MINUTE
    else if (second < HOUR) HOUR
    else if (second < DAY) DAY
    else if (second < YESTERDAY) YESTERDAY
    else OTHER
    when (result) {
        JUST_NOW -> println("Только что был в сети")
        MINUTE -> println("${minute(second)} назад был в сети")
        HOUR -> println("${hour(second)} назад был в сети")
        DAY -> println("Сегодня был в сети")
        YESTERDAY -> println("Вчера был в сети")
        OTHER -> println("Давно был в сети")
        else -> {
            error(" Неверно указано количество секунд ")
        }
    }
}

fun minute(
    count: Int
): String {
    val total = count / 60
    return if (total > 5 && total < 21) "$total минут "
    else if (total % 10 == 2 || total % 10 == 3 || total % 10 == 4) "$total минуты "
    else if (total == 1 || total % 10 == 1) "$total минуту "
    else "$total минут "
}

fun hour(
    count: Int
): String {
    val total = count / 60 / 24
    return if (total > 5 && total < 21) "$total часов "
    else if (total % 10 == 2 || total % 10 == 3 || total % 10 == 4) "$total часа "
    else if (total == 1 || total % 10 == 1) "$total час "
    else "$total минут "
}
