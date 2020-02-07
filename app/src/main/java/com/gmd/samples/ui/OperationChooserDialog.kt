package com.gmd.samples.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import com.gmd.samples.R
import kotlinx.android.synthetic.main.df_input.view.*


/**
 * @author neestell on 2020-02-07.
 */
class OperationChooserDialog : DialogFragment() {

    companion object {
        private const val ARG_OP = "operation"
        private const val TAG = "operation_dialog"

        fun show(context: Context, op: String = "+") {
            val dialog = OperationChooserDialog()
            dialog.arguments = bundleOf(ARG_OP to op)
            val fm = (context as AppCompatActivity).supportFragmentManager

            dialog.show(fm, TAG)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.df_input, container, true)
            .also { view ->
                view.buttonPlus.setOnClickListener { dismiss() }
                view.buttonMinus.setOnClickListener { dismiss() }
                view.buttonMultiplication.setOnClickListener { dismiss() }
                view.buttonDivision.setOnClickListener { dismiss() }
            }
    }
}