package com.example.di

import android.app.Application
import com.example.di.common.CommonModule
import com.example.di.main.MainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                CommonModule.create(),
                MainModule.create()
            )
        }
    }
}