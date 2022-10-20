package com.codeliner.history

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_play)
    }

    fun buttonOnclick(view: View) {
        val intent: Intent = Intent(this@StartPlay, WaterRoom::class.java)
        when (view.id) {
            R.id.button2 -> startActivity(intent)
        }
    }

    fun buttonOnclick1(view: View) {
        val intent: Intent = Intent(this@StartPlay, FinalBad::class.java)
        when (view.id) {
            R.id.button -> startActivity(intent)
        }
    }
}