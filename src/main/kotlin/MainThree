const val NULL = 0U
const val THOUSAND = 1000U
const val TEN_THOUSAND = 10000U
const val FIRST_COUPON = 100U
const val FIRST_COUPON_VALUE = 99U
const val SECOND_COUPON = 20U
const val SECOND_COUPON_VALUE = 5U
fun main() {

    while (true) {
        print("Вы в первый раз здесь? (1.Да, 2.Нет) ")
        val user = readLine()?.toInt() ?: return
        if (user.equals(1)) {
            print("Введите сумму покупки: ")
            var amount = readLine()?.toUInt() ?: return
            val amountWithDiscount = if (amount >= TEN_THOUSAND)
                amount - (amount / SECOND_COUPON)
            else if (amount <= TEN_THOUSAND && amount > THOUSAND)
                amount - FIRST_COUPON
            else amount
            val discount = if (amount <= THOUSAND)
                println("Действует следующая скидка: $NULL")
            else if (amount <= TEN_THOUSAND)
                println("Действует следующая скидка: $FIRST_COUPON")
            else println("Действует следующая скидка: $SECOND_COUPON_VALUE %")
            println("Сумма покупок с учетом скидки: $amountWithDiscount рублей")
        } else if (user.equals(2)) {
            print("Введите сумму покупки: ")
            var amount = readLine()?.toUInt() ?: return
            val amountWithDiscount = if (amount >= TEN_THOUSAND)
                (amount - (amount / SECOND_COUPON)) * FIRST_COUPON / FIRST_COUPON_VALUE
            else if (amount <= TEN_THOUSAND && amount > THOUSAND)
                (amount - FIRST_COUPON) * FIRST_COUPON / FIRST_COUPON_VALUE
            else amount
            val discount = if (amount <= THOUSAND)
                println("Действует следующая скидка: $NULL и 1% как существующему пользователю")
            else if (amount <= TEN_THOUSAND)
                println("Действует следующая скидка: $FIRST_COUPON и 1% как существующему пользовател")
            else println("Действует следующая скидка: $SECOND_COUPON_VALUE % и 1% как существующему пользовател")
            println("Сумма покупок с учетом скидки: $amountWithDisфcount рублей")
        } else {
            error("Неверно указан выбор")
        }
    }
}
