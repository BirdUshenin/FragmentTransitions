package com.birdushenin.fragmenttransitions

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        val nextToB = view.findViewById<Button>(R.id.button2)
        nextToB.setOnClickListener{
            val fragmentC = FragmentC()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragC, fragmentC)
                .addToBackStack(null)
                .commit()
        }
        val backToA = view.findViewById<Button>(R.id.backToA)
        backToA.setOnClickListener{
            requireActivity().supportFragmentManager.popBackStack()

        }
        return view
    }
}