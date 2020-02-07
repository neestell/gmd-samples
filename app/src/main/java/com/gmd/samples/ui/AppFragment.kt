package com.gmd.samples.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gmd.samples.R
import kotlinx.android.synthetic.main.f_common.*


/**
 * @author neestell on 2020-02-07.
 */
open class AppFragment: Fragment(R.layout.f_common) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonChouseOperation.setOnClickListener { OperationChooserDialog.show(requireContext()) }
    }
}