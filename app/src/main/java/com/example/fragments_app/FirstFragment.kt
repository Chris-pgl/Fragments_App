package com.example.fragments_app

import android.R.attr.onClick
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context, "onAttach", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context, "onCreate", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context, "onResume", Toast.LENGTH_SHORT).show()

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        var btnFragment = view.findViewById<Button>(R.id.btn_fragment)
        var textFragment = view.findViewById<TextView>(R.id.textView_fragment)

        btnFragment.setOnClickListener {
            Toast.makeText(requireContext(), "Hello From FirstFragment!", Toast.LENGTH_SHORT).show()
        }

        /**
         * Differenza tra Context? e requireContext()
         *
         * Context? context può essere nullable.
         * requireContext() no e genera un eccezione se non trova il context "IllegalStateException"
         *
         * es:
         * // context: può essere null
         * Toast.makeText(context, "Hello!", Toast.LENGTH_SHORT).show()
         *
         * // requireContext(): garantisce un Context oppure genera un'eccezione
         * Toast.makeText(requireContext(), "Hello!", Toast.LENGTH_SHORT).show()
         */


        return view
    }


}