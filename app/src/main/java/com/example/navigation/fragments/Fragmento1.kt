package com.example.navigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.navigation.R
import com.example.navigation.entities.Dato

class Fragmento1 : Fragment() {

    lateinit var view1 : View
    lateinit var btnto2 : Button
    lateinit var btnto3 : Button
    lateinit var inputtext : EditText
    lateinit var texttitle : TextView
    lateinit var txttosend : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view1 = inflater.inflate(R.layout.fragment_fragmento1, container, false)
        btnto2 = view1.findViewById(R.id.btnto2)
        btnto3 = view1.findViewById(R.id.btnto3)
        inputtext = view1.findViewById(R.id.inputtext)
        texttitle = view1.findViewById(R.id.fragmenttitle)

        return view1
    }

    override fun onStart() {
        super.onStart()

        texttitle.text = this.id.toString()

        btnto2.setOnClickListener {
            txttosend = inputtext.text.toString()
            val actiongoto2 = Fragmento1Directions.actionFragmento1ToFragmento2(txttosend, "DONE")
            view1.findNavController().navigate(actiongoto2)
        }

        btnto3.setOnClickListener {
            txttosend = inputtext.text.toString()
            val data = Dato(txttosend)
            val actiongoto3 = Fragmento1Directions.actionFragmento1ToFragmento3(data)
            view1.findNavController().navigate(actiongoto3)
        }
    }
}