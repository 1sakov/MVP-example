package com.example.di.main.ui

import com.example.di.common.mvp.MvpPresenter
import com.example.di.common.mvp.MvpView

interface MainContract {

    interface View : MvpView {
        fun showData(data: Unit)
        fun showLoading(isLoading: Boolean)
    }

    interface Presenter : MvpPresenter<View> {
        fun loadData()
    }
}