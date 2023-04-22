package middle

fun	add1(x:	Int, y:	Int): Int =	x + y
fun	add2(x:	Int): (Int) -> Int	=	{x + it}
fun	add3():	(Int) -> ((Int) -> Int) =	{x -> { x + it }}
val	add4:	(Int, Int) -> Int =	{x,	y -> x + y}
val	add5:	(Int) -> ((Int) -> Int)  =	{x -> {x + it}}
val	add6:	()	->	(Int) -> ((Int) -> Int)	 =	{{ x ->	{ x + it}}}
fun	main()	{
    println(add1(1,20))				//	21
    println(add2(2)(20))			//	22
    println(add3()(3)(20)) //	23
    println(add4(4,20))				//	24
    println(add5(5)(20))			//	25
    println(add6()(6)(20)) //	25
}