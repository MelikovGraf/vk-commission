const val JUST_NOW = 0
const val MINUTE = 60
const val HOUR = 3600
const val DAY = 86400
const val YESTERDAY = 172800
const val OTHER = 100_000_000

fun main() {
    while (true) {
        print("Введите кол-во секунд, проведенные пользователем: ")
        val second = readLine()?.toInt() ?: return
        timeOnline(second)
    }
}

fun timeOnline(
    second: Int
) {
    val result = if (second < MINUTE) JUST_NOW
    else if (second < HOUR) MINUTE
    else if (second < DAY) HOUR
    else if (second < YESTERDAY) DAY
    else if (second < OTHER) YESTERDAY
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
    count: Int,
): String {
    val total = count / 60
    return if (total > 5 && total < 21) "$total минут "
    else if (total % 10 == 2 || total % 10 == 3 || total % 10 == 4) "$total минуты "
    else if (total == 1 || total % 10 == 1) "$total минуту "
    else "$total минут "
}

fun hour(
    count: Int,
): String {
    val total = count / 60 / 60
    return if (total > 5 && total < 21) "$total часов "
    else if (total % 10 == 2 || total % 10 == 3 || total % 10 == 4) "$total часа "
    else if (total == 1 || total % 10 == 1) "$total час "
    else "$total минут "
}
