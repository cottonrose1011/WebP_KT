package middle

sealed class Shape ()

class Circle(val radius: Float): Shape()
class Rectangle(val width: Float, val height: Float): Shape()

fun area(shape: Shape) : Float {
    return when (shape){
        is Circle -> (shape.radius * shape.radius * Math.PI).toFloat()
        is Rectangle -> shape.height * shape.width
    }
}

fun main(){
    val circle = Circle(10F)
    val rectangle = Rectangle(10F, 20F)

    println(area(circle))
    println(area(rectangle))
}