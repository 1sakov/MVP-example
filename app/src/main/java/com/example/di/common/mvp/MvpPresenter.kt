package com.example.di.common.mvp

interface MvpPresenter<V : MvpView> {

    fun attach(view: V)

    fun detach()
}