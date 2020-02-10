package com.gmd.samples.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmd.samples.R
import kotlinx.android.synthetic.main.f_common.view.*
import moxy.MvpAppCompatFragment


/**
 * @author neestell on 2020-02-07.
 */
open class ExpressionFragment : MvpAppCompatFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.f_common, container, false)
            .also { view ->
                view.buttonChouseOperation.setOnClickListener { OperationChooserDialogFragment.show(requireContext()) }

            }
    }
}