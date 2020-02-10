package com.gmd.samples.presentation

import android.util.Log
import com.gmd.samples.domain.OperationInteractor
import moxy.InjectViewState
import moxy.MvpView
import javax.inject.Inject


/**
 * @author neestell on 2020-02-07.
 */
@InjectViewState
class OperationPresenter @Inject constructor(
        private val operationInteractor: OperationInteractor
) : AppPresenter<MvpView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        Log.d("qwqw", "onFirstViewAttach dialog")
    }

    fun selectPlus() {
        operationInteractor.sendOperation("+")
    }

    fun selectMinus() {
        operationInteractor.sendOperation("-")
    }

    fun selectMultiplication() {
        operationInteractor.sendOperation("*")
    }

    fun selectDivision() {
        operationInteractor.sendOperation("/")

    }
}