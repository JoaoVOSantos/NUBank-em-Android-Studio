package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class transferencia_realizada : AppCompatActivity() {
    lateinit var CaixaTextoValorTransferenciaRealizada : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferencia_realizada)


        val valorTransferencia = intent.getStringExtra("ValorTransferencia")
        CaixaTextoValorTransferenciaRealizada = findViewById(R.id.txtValorTransferenciaRealizada)
        CaixaTextoValorTransferenciaRealizada.setText("R$" + valorTransferencia)

        val botaoProximaTela : Button = findViewById(R.id.btnTransferenciaRealizada)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}