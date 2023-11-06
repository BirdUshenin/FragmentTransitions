package com.birdushenin.fragmenttransitions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentD : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_d, container, false)

        val DtoA = view.findViewById<Button>(R.id.ba4)

        DtoA.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack("FragmentB", 0)
        }

        return view
    }

}