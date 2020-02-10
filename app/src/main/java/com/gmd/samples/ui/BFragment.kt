package com.gmd.samples.ui

import com.gmd.samples.presentation.BPresenter
import com.gmd.samples.presentation.ExpessionView
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


/**
 * @author neestell on 2020-02-07.
 */
class BFragment : ExpressionFragment(), ExpessionView {
    @InjectPresenter
    lateinit var presenter: BPresenter

    @ProvidePresenter
    fun providePresenter() = BPresenter()
}