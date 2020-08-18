package com.conghuy.example

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.conghuy.example.di.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var networkApi: NetworkApi
    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userAvailable = findViewById<View>(R.id.target) as TextView
        networkApi.age += 1
        userAvailable.text = "MainActivity worked: ${networkApi.name} - ${networkApi.age}"

        val next = findViewById<View>(R.id.next) as Button
        next.setOnClickListener {
            startActivity(Intent(this, MyActivity::class.java))
        }
    }
}