package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class senha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_senha)


        val valorTransferencia = intent.getStringExtra("ValorTransferencia")

        val botaoProximaTela : Button = findViewById(R.id.btnConfirmarSenha)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,transferencia_realizada::class.java)
            intent.putExtra("ValorTransferencia", valorTransferencia.toString())
            startActivity(intent)
        }
    }
}