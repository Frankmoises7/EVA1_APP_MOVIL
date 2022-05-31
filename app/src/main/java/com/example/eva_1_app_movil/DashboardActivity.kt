package com.example.eva_1_app_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnClass = findViewById<Button>(R.id.dashboard_activity_btn_class)
        btnClass.setOnClickListener {
            Toast.makeText(this, "Disponible en una proxima actualizacion", Toast.LENGTH_LONG).show()
        }

        val btnClient = findViewById<Button>(R.id.dashboard_activity_btn_client)
        btnClient.setOnClickListener {
            Toast.makeText(this, "Disponible en una proxima actualizacion", Toast.LENGTH_LONG).show()
        }

        val btnLogOut = findViewById<Button>(R.id.dashboard_activity_btn_logOut)
        btnLogOut.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            this.finish()
        }
    }
}