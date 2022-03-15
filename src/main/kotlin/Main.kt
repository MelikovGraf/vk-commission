const val MIN_COMMISSION = 35F
const val NULL = 0F
const val COMMISSION = 0.0075F
fun main() {
    print("Input amount: ")
    val amount = readLine()?.toFloat() ?: return
    val resultCommission = amount * COMMISSION
    val result = if (resultCommission <= NULL)
        NULL
    else if (resultCommission <= MIN_COMMISSION)
            MIN_COMMISSION
    else resultCommission
    val resultFinish: Int = result.toInt()
    val resultCent = if (resultCommission <= MIN_COMMISSION)
        0
    else resultCommission - resultFinish
    println("Коммиссия составит $resultFinish рублей $resultCent копеек")
}
