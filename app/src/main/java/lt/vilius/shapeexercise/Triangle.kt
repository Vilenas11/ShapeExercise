package lt.vilius.shapeexercise

class Triangle(sideOne: Float) : Shape(sideOne, sideOne) {
    var triangleArea = 0f
    override fun calculateArea() {
        triangleArea = (sideOne * sideOne) / 2
    }

    override fun toString(): String {
        return "Trikampo plotas: $triangleArea"
    }
}