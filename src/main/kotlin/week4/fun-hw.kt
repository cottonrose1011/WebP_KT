package week4

class A(val name: String, val age: Int) {
    fun getName2(): String = name // used for function reference
}
fun main() {
    val list: List<A> = listOf(A("John", 10), A("Ted", 14)) // 2 개 객체 생성
    list.map {x -> x.age}.forEach(::println) // 각 객체의 나이 출력
    list.map {x -> x.name}.forEach(::println) // 각 객체의 이름 출력
// list 의 각 원소에서 이름만을 추출하여 names, names2 리스트를 만듦
    val names: List<String> = list.map(A::getName2) // function reference
    val names2: List<String> = list.map{x -> x.name} // lambda expression
    println(names) // [John, Ted]
    println(names == names2) // true
}