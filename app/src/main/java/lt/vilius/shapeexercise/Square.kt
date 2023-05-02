package lt.vilius.shapeexercise

class Square(sideOne: Float) : Shape(sideOne, 0f) {
    var squareArea = 0f
    override fun calculateArea(){
        squareArea = sideOne * sideOne
    }

    override fun toString(): String {
        return "kvadrato plotas: $squareArea"
    }
}