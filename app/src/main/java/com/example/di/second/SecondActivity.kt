package com.example.di.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.di.main.api.Api
import org.koin.android.ext.android.inject
import retrofit2.Retrofit

class SecondActivity : AppCompatActivity() {

    private lateinit var api: Api

    private val retrofit: Retrofit by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        api = retrofit.create(Api::class.java)
    }
}