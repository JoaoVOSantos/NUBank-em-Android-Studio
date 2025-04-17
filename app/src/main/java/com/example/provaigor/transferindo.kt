package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class transferindo : AppCompatActivity() {
    lateinit var CaixaValorTransferenciaRoxo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferindo)


        val valorTransferencia = intent.getStringExtra("ValorTransferencia")
        CaixaValorTransferenciaRoxo = findViewById(R.id.txtValorTransferenciaRoxo)
        CaixaValorTransferenciaRoxo.setText("R$" + valorTransferencia + "?")



        val botaoProximaTela : Button = findViewById(R.id.btnTransferindo)
        botaoProximaTela.setOnClickListener{

            val intent = Intent(this,como_gostaria_de_transferir::class.java)
            intent.putExtra("ValorTransferencia", valorTransferencia.toString())
            startActivity(intent)
        }
    }
}