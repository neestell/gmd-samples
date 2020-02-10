package com.gmd.samples.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmd.samples.presentation.APresenter
import com.gmd.samples.presentation.ExpessionView
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


/**
 * @author neestell on 2020-02-07.
 */
class AFragment : ExpressionFragment(), ExpessionView {

    @InjectPresenter
    lateinit var presenter: APresenter

    @ProvidePresenter
    fun providePresenter() : APresenter = APresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onResume() {
        super.onResume()
        presenter.selectOperation()
    }
}