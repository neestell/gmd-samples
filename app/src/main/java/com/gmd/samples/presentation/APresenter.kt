package com.gmd.samples.presentation

import com.gmd.samples.domain.OperationInteractor
import moxy.InjectViewState
import javax.inject.Inject


/**
 * @author neestell on 2020-02-07.
 */
@InjectViewState
class APresenter @Inject constructor(
        private val operationInteractor: OperationInteractor
) : AppPresenter<ExpessionView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        operationInteractor.listenOperations()
            .subscribe({ op -> viewState.setOperation(op) }, { error -> error.printStackTrace() })
            .connect()
    }

}