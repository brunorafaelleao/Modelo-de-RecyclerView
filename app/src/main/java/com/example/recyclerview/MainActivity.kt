package com.example.recyclerview

import Adapter.AdapterCheklist
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.modelo.Checklist


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//captura do id da RecyclerView e atribuindo a variável
       val rvDenguelist = findViewById<RecyclerView>(R.id.rv_denguelist)
       rvDenguelist.layoutManager = LinearLayoutManager(this)
        rvDenguelist.setHasFixedSize(true)
        //configurar o adapter
        val checkList: MutableList<Checklist> = mutableListOf()
        val adapterCheklist = AdapterCheklist(this, checkList)
        rvDenguelist.adapter = adapterCheklist

        val dengue1 = Checklist(
            R.drawable.tanque,
            mensagem = "Caixas d'água vedadas",
            check = false
        )
        checkList.add(dengue1)

        val dengue2 = Checklist(
            R.drawable.calha,
            mensagem = "Calhas totalmente limpas",
            check =  false
        )
        checkList.add(dengue2)

        val dengue3 = Checklist(
            R.drawable.garrafao,
            mensagem = "Tambores fechados",
            check =  false
        )
        checkList.add(dengue3)

        val dengue4 = Checklist(
            R.drawable.pneu,
            mensagem = "Pneus sem água por dentro",
            check =  false
        )
        checkList.add(dengue4)

        val dengue5 = Checklist(
            R.drawable.baldes,
            mensagem = "Baldes virados para baixo",
            check =  false
        )
        checkList.add(dengue5)

        val dengue6 = Checklist(
            R.drawable.arcondicionado,
            mensagem = "Bandejas de ar limpas e sem água",
            check =  false
        )
        checkList.add(dengue6)

        val dengue7 = Checklist(
            R.drawable.geladira,
            mensagem = "Bandejas da geladeira sem água",
            check =  false
        )
        checkList.add(dengue7)

        val dengue8 = Checklist(
            R.drawable.plantas,
            mensagem = "Pratos de plantas com areia",
            check =  false
        )
        checkList.add(dengue8)

        val dengue9 = Checklist(
            R.drawable.vaso_sanitario,
            mensagem = "Vaso sanitário fechado",
            check =  false
        )
        checkList.add(dengue9)

        val dengue10 = Checklist(
            R.drawable.piscina,
            mensagem = "Piscina e fonte sempre fechados",
            check =  false
        )
        checkList.add(dengue10)

        val dengue11 = Checklist(
            R.drawable.ralo,
            mensagem = "Ralos limpos e com telas",
            check =  false
        )
        checkList.add(dengue11)


    }
}