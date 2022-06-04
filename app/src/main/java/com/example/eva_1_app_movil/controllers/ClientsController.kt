package com.example.eva_1_app_movil.controllers

import android.content.Context
import com.example.eva_1_app_movil.models.Client

class ClientsController constructor(ctx: Context){
    val ctx = ctx

    fun getAll (): List<Client> {
        val clients = ArrayList<Client>()
        val clientsName = arrayOf<String>(
            "Alejandro", "Frank", "Boris", "Roberto", "Matias", "Franco", "Alondra", "Daniela"
        )
        for (i in clientsName.indices) {
            clients.add(Client(
                id = i.toLong(),
                title = "${clientsName[i]}",
                description = "Descripcion $i"
            ))
        }
        return clients
    }
}