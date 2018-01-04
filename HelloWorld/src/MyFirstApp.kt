fun main(args: Array<String>) {
    println("Hello there!")
    println("the sum is " + sum(1,2))
    println("the sum is " + sum(10,2))
    println("the sum is " + sumb(14,22))
    println("concatenation " + conc("Hello ", "how are you?"))
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sumb(x: Int,y: Int) = x + y

fun conc(x: String, y: String): String = x + y