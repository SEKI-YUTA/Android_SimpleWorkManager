package com.example.simpleworkmanager

import android.app.Application
import android.util.Log
import com.example.simpleworkmanager.data.AppContainer
import com.example.simpleworkmanager.data.DefaultAppContainer

class DemoApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        Log.d("DemoApplication", "onCreate running...")
        container = DefaultAppContainer(this)
    }
}