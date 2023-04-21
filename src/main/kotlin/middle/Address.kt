package middle

class Address {
    var name = "Addr1"
}
class	Address2	{
    var	name:	String	=	"Addr2"
        get()	=		field	+	"Addr2"			//	field	=	name
        set(value)	=	if	(value	==	"a") field	=	"b"	else	field	=	value
}
data	class	Address3	(val	name:	String	=	"Addr3")
fun	main	() {
    val addr1 = Address()
    val addr2 = Address2()
    val addr3 = Address3()
    println(addr1.name)        //	(a)
    println(addr2.name)        //	(b)

    addr2.name = "a"
    println(addr2.name)        //	(c)
    addr2.name = "aaa"
    println(addr2.name)        //	(d)
    println(addr3.name)     // (e)
}