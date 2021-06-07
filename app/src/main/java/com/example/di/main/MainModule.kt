package com.example.di.main

import com.example.di.main.ui.MainContract
import com.example.di.main.ui.MainPresenter
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

object MainModule {

    fun create(): Module = module {
        factory { MainPresenter(get()) } bind MainContract.Presenter::class
    }
}