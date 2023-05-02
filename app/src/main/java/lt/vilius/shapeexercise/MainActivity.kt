package lt.vilius.shapeexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val circle = Circle(15f)
        val triangle = Triangle(5f)
        val square = Square(6f)
        chooseShape(circle)
        chooseShape(square)
        chooseShape(triangle)

    }

    private fun chooseShape(shape : Shape) {
        shape.calculateArea()
        Log.i("Tag", "$shape")
    }


}