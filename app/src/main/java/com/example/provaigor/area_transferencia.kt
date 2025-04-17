package com.example.provaigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class area_transferencia : AppCompatActivity() {
    lateinit var valorTransferencia : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_transferencia)




        val botaoProximaTela : Button = findViewById(R.id.btnAreaTransferencia)
        botaoProximaTela.setOnClickListener{
            valorTransferencia = findViewById(R.id.txtValorTransferencia)


            val intent = Intent(this,contatos_transferir::class.java)

            intent.putExtra("ValorTransferencia", valorTransferencia.text.toString())

            startActivity(intent)
        }
    }
}