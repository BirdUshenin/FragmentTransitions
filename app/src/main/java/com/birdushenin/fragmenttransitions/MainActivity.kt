package com.birdushenin.fragmenttransitions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentA = FragmentA()

        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragA, fragmentA)
        transaction.addToBackStack("FragmentA")
        transaction.commit()

    }

}