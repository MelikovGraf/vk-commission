fun main() {
    while (true) {
        paymant()
    }
}

fun paymant() {
    print("\nВведите цифру типа карты: \n1. MasterCard  \n2. Мир \n3. VkPay\n")
    val typeCard = readLine()?.toInt() ?: return
    if (typeCard < 3 && typeCard > 0) {
        print("Введите сумму предыдущий выплат: ")
        val prevPay = readLine()?.toInt() ?: return
        print("Введите сумму перевода: ")
        val sumPay = readLine()?.toInt() ?: return
        when (typeCard) {
            1 -> println("Сумма к оплате с учетом коммиссии ${masterCard(prevPay, sumPay)}")
            2 -> println("Сумма к оплате с учетом коммиссии ${mir(prevPay, sumPay)}")
            3 -> println("Сумма к оплате с учетом коммиссии ${vk(prevPay, sumPay)}")
        }
    } else error("Error")
}

fun vk(
    prevPay: Int = 0,
    pay: Int
): Int {
    val result = if (pay < 15000 && prevPay < 40000) return pay
    else error("Ошибка. Возможно превышен лимит")
}

fun masterCard(
    prevPay: Int = 0,
    pay: Int
): Int {
    val result = if (pay >= 300 && pay <= 7500) return pay
    else if (pay < 150000 && prevPay < 600000 && pay > 0) return pay + (pay * 6 / 1000) + 20
    else error("Ошибка. Возможно превышен лимит")
}

fun mir(
    prevPay: Int = 0,
    pay: Int
): Int {
    val result = if (pay >= 300 && pay <= 7500) return pay
    else if (pay < 150000 && prevPay < 600000 && pay > 0) return pay + (pay * 75 / 10000)
    else error("Ошибка. Возможно превышен лимит")
}
