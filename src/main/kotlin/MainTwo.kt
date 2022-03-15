const val VALUE_ONE = 10U
const val VALUE_TWO = 1U
const val VALUE_THREE = 11U
fun main() {
    print("Input count likes: ")
    val count = readLine()?.toUInt() ?: return
    val likes = if (count == VALUE_THREE)
        println("Нравится $count людям")
        else if (count % VALUE_ONE == VALUE_TWO)
            println("Нравится $count человеку")
    else println("Нравится $count людям")
}
