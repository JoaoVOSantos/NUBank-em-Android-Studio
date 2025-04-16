package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class transferindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferindo)


        val botaoProximaTela : Button = findViewById(R.id.btnTransferindo)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,como_gostaria_de_transferir::class.java)
            startActivity(intent)
        }
    }
}