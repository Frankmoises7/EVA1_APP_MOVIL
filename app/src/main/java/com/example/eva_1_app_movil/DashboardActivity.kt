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

        val btnClients = findViewById<Button>(R.id.dashboard_activity_btn_clients)
        btnClients.setOnClickListener {
            val intent = Intent(this, ClientsActivity::class.java)
            startActivity(intent)
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