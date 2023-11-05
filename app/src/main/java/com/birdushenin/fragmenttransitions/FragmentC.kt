package com.birdushenin.fragmenttransitions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_c, container, false)

        val backToA = view.findViewById<Button>(R.id.ba3)
        backToA.setOnClickListener{
            requireActivity().supportFragmentManager.popBackStack("Fragment A", 0)
        }
        return view
    }

}