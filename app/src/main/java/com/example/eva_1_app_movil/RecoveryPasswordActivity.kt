package com.example.eva_1_app_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RecoveryPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovey_password)

        val btnRecoveryPassword = findViewById<Button>(R.id.recovery_password_activity_btn_recoveryPassword)
        btnRecoveryPassword.setOnClickListener {
            Toast.makeText(this, "Revisa tu casilla de correo", Toast.LENGTH_LONG).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            this.finish()
        }

        val tvToLogin = findViewById<TextView>(R.id.recovery_password_activity_tv_goToLogin)
        tvToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            this.finish()
        }
    }
}