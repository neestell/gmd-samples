package com.gmd.samples.presentation

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import moxy.MvpPresenter
import moxy.MvpView


/**
 * @author neestell on 2020-02-07.
 */
open class AppPresenter<V : MvpView> : MvpPresenter<V>()  {
    private val compositeDisposable = CompositeDisposable()

    override fun onDestroy() {
        compositeDisposable.dispose()
    }

    protected fun Disposable.connect(): Disposable {
        compositeDisposable.add(this)
        return this
    }

    protected fun disposeAll() {
        compositeDisposable.dispose()
    }
}