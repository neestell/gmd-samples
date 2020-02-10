package com.gmd.samples.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.gmd.samples.R
import com.gmd.samples.di.DI
import com.gmd.samples.presentation.OperationPresenter
import kotlinx.android.synthetic.main.df_input.view.*
import moxy.MvpAppCompatDialogFragment
import moxy.MvpView
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


/**
 * @author neestell on 2020-02-07.
 */
class OperationChooserDialogFragment : MvpAppCompatDialogFragment(), MvpView {

    companion object {
        private const val ARG_OP = "operation"
        private const val TAG = "operation_dialog"

        fun show(context: Context, op: String = "+") {
            val dialog = OperationChooserDialogFragment()
            dialog.arguments = bundleOf(ARG_OP to op)
            val fm = (context as AppCompatActivity).supportFragmentManager

            dialog.show(fm, TAG)
        }
    }

    @InjectPresenter
    lateinit var presenter: OperationPresenter

    @ProvidePresenter
    fun providePresenter() = DI.openOperationChooserScope().providePresenter();

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.df_input, container, true)
            .also { view ->
                view.buttonPlus.setOnClickListener {
                    presenter.selectPlus()
                    dismiss()
                }
                view.buttonMinus.setOnClickListener {
                    presenter.selectMinus()
                    dismiss()
                }
                view.buttonMultiplication.setOnClickListener {
                    presenter.selectMultiplication()
                    dismiss()
                }
                view.buttonDivision.setOnClickListener {
                    presenter.selectDivision()
                    dismiss()
                }
            }
    }
}