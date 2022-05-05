package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Modelo.Personaje
import com.example.recycleview.adaptador.PersonajeAdapter

class MainActivity : AppCompatActivity() {
    lateinit var myRecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonaje = ArrayList<Personaje>()
        listaPersonaje.add(Personaje("Mazda MX-5","https://cdn.buttercms.com/B1nW0iduSMupKSkUqzR1"))
        listaPersonaje.add(Personaje("Porche 911","https://cdn.buttercms.com/HimuE6ZPTiOHueHGbmBj"))
        listaPersonaje.add(Personaje("Alpine A110","https://cdn.buttercms.com/gRIuLm1Sdyhs1cnxi5RB"))
        listaPersonaje.add(Personaje("Porsche 718","https://cdn.buttercms.com/CeOXxP7bRISP7ki1pYOx"))
        listaPersonaje.add(Personaje("McLaren 570S","https://cdn.buttercms.com/AINYTNuYS3OHYxDrUEUa"))
        listaPersonaje.add(Personaje("Porsche 718","https://cdn.buttercms.com/CeOXxP7bRISP7ki1pYOx"))
        listaPersonaje.add(Personaje("Mercedes-AMG C 63 S","https://cdn.buttercms.com/DaZSM8MR2yA9e1W0MKp3"))
        listaPersonaje.add(Personaje("Nissan GT-R","https://cdn.buttercms.com/KLKI23fxT25MIB1BwlQ4"))
        listaPersonaje.add(Personaje("Toyota GR Supra","https://cdn.buttercms.com/LxPsuHnPTeGp7WCTlJS3"))
        myRecycler=findViewById(R.id.recylerV)
        myRecycler.adapter= PersonajeAdapter(listaPersonaje)
        myRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}