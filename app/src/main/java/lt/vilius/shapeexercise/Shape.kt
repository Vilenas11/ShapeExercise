package lt.vilius.shapeexercise

open class Shape(sideOne : Float, sideTwo : Float) {
    var area : Float = 0f
    var sideOne = 0f
    var sideTwo = 0f

    open fun calculateArea(){
        area = sideOne * sideTwo
    }

    override fun toString(): String {
        return "Jusu figuros plotas yra : $area kv.cm"
    }
}