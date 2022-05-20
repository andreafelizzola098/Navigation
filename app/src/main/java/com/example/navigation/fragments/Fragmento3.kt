package com.example.navigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.navigation.R

class Fragmento3 : Fragment() {

    lateinit var view3 : View
    lateinit var btn3to1 : Button
    lateinit var title3 : TextView
    lateinit var secondTitle : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view3 = inflater.inflate(R.layout.fragment_fragmento3, container, false)
        btn3to1 = view3.findViewById(R.id.btn3to1)
        title3 = view3.findViewById(R.id.title3)
        secondTitle = view3.findViewById(R.id.txt3)

        return view3
    }

    override fun onStart() {
        super.onStart()

        val txt = Fragmento3Args.fromBundle(requireArguments()).dato
        secondTitle.text = txt.dato

        btn3to1.setOnClickListener {
            val action3to1 = Fragmento3Directions.actionFragmento3ToFragmento1()
            view3.findNavController().navigate(action3to1)
        }

    }

}