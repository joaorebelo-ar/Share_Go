package com.example.partilhas50.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.partilhas50.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_setup.*

class Setup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
