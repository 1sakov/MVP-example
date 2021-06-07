package com.example.di.main.ui

import android.os.Bundle
import android.util.Log
import com.example.di.R
import com.example.di.common.mvp.BaseMvpActivity
import org.koin.android.ext.android.inject

class MainActivity :
    BaseMvpActivity<MainContract.View, MainContract.Presenter>(),
    MainContract.View {

    override val presenter: MainContract.Presenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("###", "Main activity created")
        presenter.loadData()
    }

    override fun showData(data: Unit) {
        // todo: do smth
        Log.d("###", "Show data ")
    }

    override fun showLoading(isLoading: Boolean) {
        TODO("Not yet implemented")
    }
}

/*
* 1. MainActivity -> MainPresenter.loadData()
* 2. MainPresenter -> Api.getData()
* 3. MainPresenter -> MainActivity.showData()
* */