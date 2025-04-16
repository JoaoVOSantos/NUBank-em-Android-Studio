package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class como_gostaria_de_transferir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_como_gostaria_de_transferir)


        val botaoProximaTela : Button = findViewById(R.id.btnComoGostariaTransferir)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,revise_transferencia::class.java)
            startActivity(intent)
        }
    }
}