package com.gmd.samples.presentation

import android.util.Log
import moxy.InjectViewState
import javax.inject.Inject


/**
 * @author neestell on 2020-02-07.
 */
@InjectViewState
class BPresenter @Inject constructor() : AppPresenter<ExpessionView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        Log.d("qwqw", "onFirstViewAttach B")
    }
}