package com.example.projetocores

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val layout = findViewById<LinearLayout>(R.id.layoutPrincipal)
        val corRecebida = intent.getStringExtra("cor")

        when (corRecebida?.lowercase()){
            "vermelho" -> layout.setBackgroundColor(Color.RED)
            "azul" -> layout.setBackgroundColor(Color.BLUE)
            "preto" -> layout.setBackgroundColor(Color.BLACK)
            "amarelo" -> layout.setBackgroundColor(Color.YELLOW)
            "verde" -> layout.setBackgroundColor(Color.GREEN)
            "magenta" -> layout.setBackgroundColor(Color.MAGENTA)
            else -> layout.setBackgroundColor(Color.GRAY)
        }
    }
}