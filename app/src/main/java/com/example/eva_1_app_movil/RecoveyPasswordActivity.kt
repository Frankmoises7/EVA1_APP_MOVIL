package com.example.eva_1_app_movil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RecoveyPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovey_password)

        val btnRecoveryPassword = findViewById<Button>(R.id.recovery_password_activity_btn_recoveryPassword)
        btnRecoveryPassword.setOnClickListener {
            Toast.makeText(this, "Revisa tu casilla de correo", Toast.LENGTH_LONG).show()
        }

        val btnCancel = findViewById<Button>(R.id.recovery_password_activity_btn_cancel)
        btnCancel.setOnClickListener {  }

    }
}