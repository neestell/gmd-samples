package com.gmd.samples.presentation

import android.util.Log
import com.gmd.samples.domain.OperationInteractor
import moxy.InjectViewState
import javax.inject.Inject


/**
 * @author neestell on 2020-02-07.
 */
@InjectViewState
class BPresenter @Inject constructor(
        private val operationInteractor: OperationInteractor
) : AppPresenter<ExpessionView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        Log.d("qwqw", "onFirstViewAttach B")
        operationInteractor.listenOperations()
            .subscribe({ op -> Log.d("qwqw", "Op $op") }, { error -> error.printStackTrace() })
            .connect()
    }
}