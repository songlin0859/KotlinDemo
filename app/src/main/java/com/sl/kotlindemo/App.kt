package com.sl.kotlindemo

import android.app.Application
import com.sl.kotlindemo.koin.myModule
import org.koin.android.ext.android.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(myModule))
    }
}