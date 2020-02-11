package com.gmd.samples.ui

import android.os.Bundle
import android.view.View
import com.gmd.samples.di.DI
import com.gmd.samples.presentation.BPresenter
import com.gmd.samples.presentation.ExpessionView
import kotlinx.android.synthetic.main.f_common.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


/**
 * @author neestell on 2020-02-07.
 */
class BFragment : ExpressionFragment(), ExpessionView {
    @InjectPresenter
    lateinit var presenter: BPresenter

    @ProvidePresenter
    fun providePresenter(): BPresenter = DI.plusBComponent().providePresenter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonChouseOperation.setOnClickListener { OperationChooserDialogFragment.show(requireContext()) }
    }

    override fun setOperation(op: String) {
        textResult.text = makeExpression(op, 40, 5)
    }
}