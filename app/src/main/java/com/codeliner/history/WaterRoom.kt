package com.codeliner.history

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WaterRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_room)
    }
    fun buttonOnclick(view: View) {
        val intent: Intent = Intent(this@WaterRoom, Bed::class.java)
        when (view.id) {
            R.id.button4 -> startActivity(intent)
        }
    }
    fun buttonOnclick1(view: View) {
        val intent: Intent = Intent(this@WaterRoom, Luck::class.java)
        when (view.id) {
            R.id.button3 -> startActivity(intent)
        }
    }
}