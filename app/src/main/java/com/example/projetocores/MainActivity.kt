package com.example.projetocores

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editCor = findViewById<EditText>(R.id.editTextCor)
        val botao = findViewById<Button>(R.id.buttonEnviar)

        botao.setOnClickListener{
            val corDigitada = editCor.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("cor", corDigitada)

            startActivity(intent)
        }
    }
}