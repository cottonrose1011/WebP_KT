package week4

fun main() {
    val isGreaterThan10: (Int) -> Boolean = {x -> x > 10}
    val isGreaterThan102: (Int) -> Boolean = { it > 10}
    println(isGreaterThan10(5))
    println(isGreaterThan10(23))
    println(isGreaterThan102(5))
    println(isGreaterThan102(50))
}

    // 함수 타입이 표준 라이브러리에 내장 되어 import 불 필요
    // 인터페이스 Function : 이진 함수 (매우 자주 사용됨)
    // 이진 함수 Function을 기호 -> 로 표현하고, infix로 표현하자
    // Java의 함수 타입: Function<Integer, Boolean>
    // Kotlin의 함수 타입: (Int) -> Boolean