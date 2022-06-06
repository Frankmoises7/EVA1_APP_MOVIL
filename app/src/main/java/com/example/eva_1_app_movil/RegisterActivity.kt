package com.example.eva_1_app_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.eva_1_app_movil.utils.TilValidator
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val tilUsernameRegister = findViewById<TextInputLayout>(R.id.register_activity_til_userName)
        val tilEmailRegister = findViewById<TextInputLayout>(R.id.register_activity_til_email)
        val tilPasswordRegister = findViewById<TextInputLayout>(R.id.register_activity_til_password)
        val btnRegister = findViewById<Button>(R.id.register_activity_btn_register)

        btnRegister.setOnClickListener {
            val username = tilUsernameRegister.editText?.text
            val email = tilEmailRegister.editText?.text
            val password = tilPasswordRegister.editText?.text

            val usernameValid = TilValidator(tilUsernameRegister)
                .required()
                .isValid()

            val emailValid = TilValidator(tilEmailRegister)
                .required()
                .email()
                .isValid()

            val passwordValid = TilValidator(tilPasswordRegister)
                .required()
                .isValid()

            if (usernameValid && emailValid && passwordValid) {
                Toast.makeText(this, "Nuevo admin creado satifactoriamente", Toast.LENGTH_LONG).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                this.finish()
            }
        }
        val tvToLogin = findViewById<TextView>(R.id.register_activity_tv_goToLogin)
        tvToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}