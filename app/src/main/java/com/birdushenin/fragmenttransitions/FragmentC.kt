package com.birdushenin.fragmenttransitions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener


class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_c, container, false)
        setFragmentResultListener("result_key") { key, result ->
            val data = result.getString("data")
            view.findViewById<TextView>(R.id.textView).text = data
        }

        val backToA = view.findViewById<Button>(R.id.ba3)
        backToA.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack("FragmentA", 0)
        }

        val goToD = view.findViewById<Button>(R.id.button2)
        goToD.setOnClickListener {
            val fragmentD = FragmentD()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragD, fragmentD)
                .addToBackStack(null)
                .commit()
        }
        return view
    }

}