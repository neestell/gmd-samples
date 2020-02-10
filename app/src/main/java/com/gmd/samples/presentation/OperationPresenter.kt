package com.gmd.samples.presentation

import android.util.Log
import moxy.InjectViewState
import moxy.MvpView
import javax.inject.Inject


/**
 * @author neestell on 2020-02-07.
 */
@InjectViewState
class OperationPresenter @Inject constructor() : AppPresenter<MvpView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        Log.d("qwqw", "onFirstViewAttach dialog")
    }
}