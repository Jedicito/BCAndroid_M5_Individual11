package chl.ancud.m5_individual11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// Parte A
fun main() {
    var num1 = 10
    var num2 = 33
    var num3 = 66

    var resultado = num1 + num2 + num3

    println("Resultado 1 = $resultado")

    num1 = 55

    resultado = num1 + num2 + num3

    println("Resultado 2 = $resultado")

    var promedio = (num1 + num2 + num3) / 3

    println("Promedio = $promedio")
}