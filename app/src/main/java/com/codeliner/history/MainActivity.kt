package com.codeliner.history

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonOnclick(view: View){
        val intent: Intent = Intent(this@MainActivity,StartPlay::class.java)
        when (view.id){
            R.id.play -> startActivity(intent)
        }
    }
}
