package lt.vilius.shapeexercise

class Circle(sideOne: Float) : Shape(sideOne, 0f ){
    var circleArea = 0f
    override fun calculateArea() {
        circleArea = (((sideOne * 2 ) / 3.14159).toBigDecimal()).toFloat()
    }

    override fun toString(): String {
        return "Apskritimo plotas $circleArea"
    }
}