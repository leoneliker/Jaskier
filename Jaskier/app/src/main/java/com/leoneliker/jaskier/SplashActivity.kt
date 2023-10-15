package com.leoneliker.jaskier

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val splashScreenDuration = 3000 // en milisegundos (3 segundos)
        Handler().postDelayed({
            // Inicia la siguiente actividad después de la duración del splash screen
            val intent = Intent(this, MainActivity::class.java) // Reemplaza "MainActivity" con el nombre de tu actividad principal
            startActivity(intent)
            finish() // Cierra la actividad actual para que el usuario no pueda regresar al splash screen
        }, splashScreenDuration.toLong())

    }
}