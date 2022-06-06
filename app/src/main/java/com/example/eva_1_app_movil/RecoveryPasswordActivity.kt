package com.example.eva_1_app_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.eva_1_app_movil.utils.TilValidator
import com.google.android.material.textfield.TextInputLayout

class RecoveryPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovey_password)

        val btnRecoveryPassword = findViewById<Button>(R.id.recovery_password_activity_btn_recoveryPassword)
        val tilEmailRecovery = findViewById<TextInputLayout>(R.id.recovery_password_activity_til_email_recovery)


       btnRecoveryPassword.setOnClickListener {
           //Toast.makeText(this,"Recuperar contraseña", Toast.LENGTH_SHORT).show()
           val email = tilEmailRecovery.editText?.text

           val emailValid = TilValidator(tilEmailRecovery)
               .required()
               .email()
               .isValid()

           if (emailValid) {
               Toast.makeText(this, "Las instrucciones llegarán a su correo electronico", Toast.LENGTH_LONG).show()
               val intent = Intent(this, LoginActivity::class.java)
               startActivity(intent)
           }
       }

    }
}