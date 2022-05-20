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

class Fragmento2 : Fragment() {

    lateinit var view2 : View
    lateinit var btn2to1 : Button
    lateinit var title2 : TextView
    lateinit var txttwo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view2 = inflater.inflate(R.layout.fragment_fragmento2, container, false)
        btn2to1 = view2.findViewById(R.id.btn2to1)
        title2 = view2.findViewById(R.id.title2)
        txttwo = view2.findViewById(R.id.txttwo)

        return view2
    }

    override fun onStart() {
        super.onStart()

        title2.text = Fragmento2Args.fromBundle(requireArguments()).txt2
        txttwo.text = Fragmento2Args.fromBundle(requireArguments()).txtfrominput

        btn2to1.setOnClickListener {
            val action2goto1 = Fragmento2Directions.actionFragmento2ToFragmento1()
            view2.findNavController().navigate(action2goto1)
        }
    }
}