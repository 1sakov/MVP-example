package com.example.di.common

import com.example.di.main.api.Api
import org.koin.dsl.module
import retrofit2.Retrofit

object CommonModule {

    fun create() = module {
        single {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://google.com")
                .build()

            retrofit.create(Api::class.java)
        }

    }
}