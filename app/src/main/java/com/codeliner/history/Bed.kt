package com.codeliner.history

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Bed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bed)
    }
    fun buttonOnclick(view: View) {
        val intent: Intent = Intent(this@Bed, Pauki::class.java)
        when (view.id) {
            R.id.button5 -> startActivity(intent)
        }
    }
    fun buttonOnclick1(view: View) {
        val intent: Intent = Intent(this@Bed, Final::class.java)
        when (view.id) {
            R.id.button6 -> startActivity(intent)
        }
    }
}