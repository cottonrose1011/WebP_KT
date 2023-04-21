package middle

class People(val name: String, val age: Int) {
    companion object{
        var count = 0
        fun max(x: Int, y: Int) : Int = if(x > y) x else y
    }
}

fun main(){
    val obj1 = People("Hong", 21)
    People.count++
    val obj2 = People("Kim", 22)
    People.count++
    val obj3 = People("Lee", 23)
    People.count++

    println(People.count)
    println(People.max(obj1.age, obj3.age))
}