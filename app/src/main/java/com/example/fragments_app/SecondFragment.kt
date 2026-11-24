package com.example.fragments_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)


        val textViewSecondFragment = view.findViewById<TextView>(R.id.second_fragmentText)
        val btnSecondFragment = view.findViewById<Button>(R.id.btn_secondFragment)

        btnSecondFragment.setOnClickListener {
            Toast.makeText(context, "Hello From SecondFragment!", Toast.LENGTH_SHORT).show()
        }

        return view

    }



}