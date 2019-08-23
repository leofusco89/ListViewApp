package com.example.listviewapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.listviewapp.R
import com.example.listviewapp.models.Libros

class LibrosAdapter(var listLibros: List<Libros>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //Inflamos una variable View con el layout de item_libro.xml
        val vista = LayoutInflater.from(parent!!.context).inflate(R.layout.item_libro, parent, false)

        val tvDatosLibro = vista.findViewById<TextView>(R.id.tv_datosLibro)
        //Esta última línea también podemos escribirla así:
        //val tvDatosLibro: TextView = vista.findViewById(R.id.tv_datosLibro)
    }

    override fun getItem(p0: Int): Libros {
        return listLibros[p0]
    }

    override fun getItemId(p0: Int): Long {
        return listLibros[p0].id //Si no tendría atributo ID
    }

    override fun getCount(): Int {
        return listLibros.size
    }

}