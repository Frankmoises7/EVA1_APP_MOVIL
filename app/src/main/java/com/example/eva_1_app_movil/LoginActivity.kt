package com.example.eva_1_app_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.eva_1_app_movil.utils.TilValidator
import com.google.android.material.textfield.TextInputLayout


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.login_activity_btn_login)
        val tvRecoveryPassWord = findViewById<TextView>(R.id.login_activity_tv_recoveryPassword)
        val tilEmail = findViewById<TextInputLayout>(R.id.login_activity_til_email)
        val tilPassword = findViewById<TextInputLayout>(R.id.login_activity_til_password)


        btnLogin.setOnClickListener {
           val email = tilEmail.editText?.text
           val password = tilPassword.editText?.text

            val emailValid = TilValidator(tilEmail)
                .required()
                .email()
                .isValid()

            val passwordValid = TilValidator(tilPassword)
                .required()
                .isValid()

            if (emailValid && passwordValid) {
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                this.finish()
            } else {
                Toast.makeText(this, "Credenciales Invalidas", Toast.LENGTH_LONG).show()
            }
        }


        tvRecoveryPassWord.setOnClickListener {
            val intent = Intent(this, RecoveryPasswordActivity::class.java)
            startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            this.finish()
        }
    }
}