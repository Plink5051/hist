package com.codeliner.history

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
    }
    fun buttonOnclick(view: View) {
        val intent: Intent = Intent(this@Final, FinalGood::class.java)
        when (view.id) {
            R.id.button7 -> startActivity(intent)
        }
    }
    fun buttonOnclick1(view: View) {
        val intent: Intent = Intent(this@Final, FinalBad::class.java)
        when (view.id) {
            R.id.button8 -> startActivity(intent)
        }
    }
}