package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class contatos_transferir : AppCompatActivity() {
    lateinit var CaixaTextoPraQuemTransferir : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contatos_transferir)

        val valorTransferencia = intent.getStringExtra("ValorTransferencia")
        CaixaTextoPraQuemTransferir = findViewById(R.id.txtPraQuemTransferirDinheiro)
        CaixaTextoPraQuemTransferir.setText("Para quem você quer transferir R$" + valorTransferencia + "?")


        val botaoProximaTela : Button = findViewById(R.id.btnContatosTransferir)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,transferindo::class.java)
            intent.putExtra("ValorTransferencia", valorTransferencia.toString())
            startActivity(intent)
        }
    }
}