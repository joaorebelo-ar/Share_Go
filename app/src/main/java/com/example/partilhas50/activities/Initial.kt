package com.example.partilhas50.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private val TAG = Initial::class.qualifiedName

class Initial : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!isSetupDone()) {
            Log.i(TAG, "Setup is not done")
            Intent(this, Setup::class.java).apply {
                startActivity(this)
            }
        }
    }


    fun isSetupDone(): Boolean {
        return false
    }
}
