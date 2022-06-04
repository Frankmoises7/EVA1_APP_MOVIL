package com.example.eva_1_app_movil.controllers

import android.content.Context
import com.example.eva_1_app_movil.models.Client

class ClientsController constructor(ctx: Context){
    val ctx = ctx

    fun getAll (): List<Client> {
        val clients = ArrayList<Client>()
        for (i in 1..50) {
            clients.add(Client(
                id = i.toLong(),
                title = "Titulo $i",
                description = "Descripcion $i"
            ))
        }
        return clients
    }
}