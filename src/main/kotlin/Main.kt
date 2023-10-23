fun main(args: Array<String>) {
    var i: Int = 13
    val s: String = "Hello World"
    lateinit var found : String

    println("This is a integer ${i}")
    println("This is a string ${s}")
    var marbles: Int? = null
    var fishFoodTreats = marbles?.dec()
    if (marbles != null) {
        fishFoodTreats = marbles.dec()
    }

    println("This is a data with mark question operation ${fishFoodTreats}")

    var fishFoodTreatsWithMarkColon = marbles?.dec() ?: 0

    println("This is a data with mark colon question operation ${fishFoodTreatsWithMarkColon}")

    val array = Array (5) { it * 2 }

    println("This is an array ${array.toList()}")

    var num = when(true) {
        true -> 100
        else -> 500
    }

    println("It is ${num} because it is true")

    num = when(false) {
        true -> 100
        else -> 500
    }

    println("It is ${num} because it is false")

    


}