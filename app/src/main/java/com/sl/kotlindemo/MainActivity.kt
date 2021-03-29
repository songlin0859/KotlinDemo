package com.sl.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.sl.kotlindemo.koin.Address
import com.sl.kotlindemo.koin.ScopeData
import com.sl.kotlindemo.koin.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.inject
import org.koin.android.scope.ext.android.bindScope
import org.koin.android.scope.ext.android.createScope

class MainActivity : AppCompatActivity() {
    private val user:User by inject()
    private val user1:User by inject()
    private val address:Address by inject()
    private val address1:Address by inject()

    private val scopeData: ScopeData by inject()
    private val scopeData1: ScopeData by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindScope(createScope("myScope"))
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = "${user === user1}, ${address === address1}"

        println(scopeData)
        println(scopeData1)
        println(scopeData === scopeData1)
        //014 2 3
        println("0--${Thread.currentThread().name}")
        lifecycleScope.launch/*(Dispatchers.Main)*/ {
            println("1--${Thread.currentThread().name}")
            val getStr = withContext(Dispatchers.IO){
                println("2--${Thread.currentThread().name}")
                findViewById<TextView>(R.id.textView).text = Thread.currentThread().name
                getString()
            }
            println("3--${Thread.currentThread().name}")
            findViewById<TextView>(R.id.textView).text = Thread.currentThread().name + getStr
        }
        println("4--${Thread.currentThread().name}")
    }

    private suspend fun getString(): String{
        delay(3000);
        return "suspend getString"
    }
}