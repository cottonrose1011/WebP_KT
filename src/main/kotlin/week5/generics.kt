package week5

class Gen<T, U> {
    val fst: (T) -> (U) -> T = {x -> {_ -> x}}
}

fun Gen<Int,String>.loop(): String {while (true); return "No Return"}

fun main(){
    var obj: Gen<Int, String> = Gen()
    println(obj.fst(123)("abc"))
    var obj2: Gen<Boolean, Gen<Int, String>> = Gen()
    println(obj2.fst(true)(obj))
    println(obj.fst(1+2)(obj.loop())) // call-by-value: non-termination
    // 위의 식을 call-by-name 형태로 실행하면 계산은 termination하고 결과 값 3이 프린트된다.
}