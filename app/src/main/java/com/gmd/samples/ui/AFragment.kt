package com.gmd.samples.ui

import android.os.Bundle
import android.view.View
import com.gmd.samples.di.DI
import com.gmd.samples.presentation.APresenter
import com.gmd.samples.presentation.ExpessionView
import kotlinx.android.synthetic.main.f_common.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


/**
 * @author neestell on 2020-02-07.
 */
class AFragment : ExpressionFragment(), ExpessionView {

    @InjectPresenter
    lateinit var presenter: APresenter

    @ProvidePresenter
    fun providePresenter() : APresenter = DI.plusAComponent().providePresenter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonChouseOperation.setOnClickListener { OperationChooserDialogFragment.show(requireContext()) }
    }
}