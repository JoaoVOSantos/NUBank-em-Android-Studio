package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class area_transferencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_transferencia)

        val botaoProximaTela : Button = findViewById(R.id.btnAreaTransferencia)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,contatos_transferir::class.java)
            startActivity(intent)
        }
    }
}