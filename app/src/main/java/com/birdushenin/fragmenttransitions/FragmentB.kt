package com.birdushenin.fragmenttransitions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        val nextToB = view.findViewById<Button>(R.id.button2)
        nextToB.setOnClickListener {
            val result = "Привет, kak dela? This is Fragment C"
            setFragmentResult("result_key", bundleOf("data" to result))

            val fragmentC = FragmentC()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragC, fragmentC)
                .addToBackStack(null)
                .commit()
        }
        val backToA = view.findViewById<Button>(R.id.backToA)
        backToA.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
        return view
    }
}