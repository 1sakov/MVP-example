package com.example.di.main.api

import retrofit2.http.GET

interface Api {

    @GET("")
    fun getData()
}