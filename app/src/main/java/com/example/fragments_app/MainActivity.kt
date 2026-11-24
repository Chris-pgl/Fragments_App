package com.example.fragments_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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

        /**
         * Fragments in android sono come i mattoncini lego per costruire un applicazione
         * Un Fragment rappresenta una porzione riutilizzabile dell'interfaccia utente.
         * Definisce e gestisce il proprio layout, ciclo di vita ed eventi imput.
         * Non possono vivere soli, devono essere ospitati da un activity i da un altro fragment
         *
         * es: gerarchia di un fragment:
         * 1- MainActivity: ospita Fragment A. quindi:
         * 2- Fragment A
         * 3- Fragment B spitato da Fragment A,
         * 5- Fragment C ospitato da Fragment B
         * e così via se serve.
         */


    }


}