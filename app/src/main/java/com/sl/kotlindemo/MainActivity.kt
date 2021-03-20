package com.sl.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sl.kotlindemo.koin.User
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val user:User by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = "${user.name}=>${user.age}"
    }
}