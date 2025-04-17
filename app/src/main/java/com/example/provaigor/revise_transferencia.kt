package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class revise_transferencia : AppCompatActivity() {
    lateinit var CaixaValorTransferir : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_revise_transferencia)


        val valorTransferencia = intent.getStringExtra("ValorTransferencia")
        CaixaValorTransferir = findViewById(R.id.txtValorTransferir)
        CaixaValorTransferir.setText("R$" + valorTransferencia)

        val botaoProximaTela : Button = findViewById(R.id.btnReviseTransferencia)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,senha::class.java)
            intent.putExtra("ValorTransferencia", valorTransferencia.toString())
            startActivity(intent)
        }
    }
}