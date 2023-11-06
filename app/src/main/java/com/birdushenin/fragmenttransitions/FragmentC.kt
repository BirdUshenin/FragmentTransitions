package com.birdushenin.fragmenttransitions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.setFragmentResult
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
        backToA.setOnClickListener{
           requireActivity().supportFragmentManager.popBackStack("FragmentA", 0)
        }

        return view
    }

}