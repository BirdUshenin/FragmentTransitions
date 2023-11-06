package com.birdushenin.fragmenttransitions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)


        val nextToB = view.findViewById<Button>(R.id.button)
        nextToB.setOnClickListener{
            val fragmentB = FragmentB()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragB, fragmentB)
                .addToBackStack(null)
                .commit()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}