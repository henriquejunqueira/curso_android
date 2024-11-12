package com.henriquejunqueira.primeiroprojeto

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // função que será executada quando for clicado/pressionado o botão de sorteio
    fun sortear(view: View){

        // println("foi clicado!")

        // encontra um item de interface por ID e salva na variável "textoResultado"
        val textoResultado = findViewById<TextView>(R.id.text_resultado)

        // gera números de 0 a 10, o 11 não entra
        val numeroSorteado = Random().nextInt(11)

        // seta o valor do número sorteado na variável textoResultado que vai aparecer na tela
        textoResultado.setText("número gerado $numeroSorteado")

    }

}