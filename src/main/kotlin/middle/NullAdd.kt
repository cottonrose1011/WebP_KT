package middle

fun	safeAdd(x: Int?, y: Int?): Int? = y?.let { x?.plus(it) }

fun	main()	{
    println(safeAdd(2,	4))	//	6
    println(safeAdd(null,	4))	//	nul
    println(safeAdd(2,	null))	//	null
    println(safeAdd(null,	null))  //	null
}