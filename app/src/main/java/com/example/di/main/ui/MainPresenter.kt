package com.example.di.main.ui

import android.util.Log
import com.example.di.common.mvp.BasePresenter
import com.example.di.main.api.Api

class MainPresenter(
    private val api: Api
) : BasePresenter<MainContract.View>(), MainContract.Presenter {

    override fun loadData() {
        Log.d("###", "Load data")
//        val data = api.getData()
        view?.showData(Unit)
    }
}