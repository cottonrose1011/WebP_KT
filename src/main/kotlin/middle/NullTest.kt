package middle

class Person {
    val name : String? = null
}

fun main() {
    val p = Person();

    val check : String? = p.name?.lowercase()
    println(check)
}