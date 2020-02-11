package com.gmd.samples.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmd.samples.R
import moxy.MvpAppCompatFragment


/**
 * @author neestell on 2020-02-07.
 */
open class ExpressionFragment : MvpAppCompatFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.f_common, container, false)
    }

    fun makeExpression(op: String, v1: Int, v2: Int): String {
        var result = 0
        when (op) {
            "+" -> result = v1 + v2
            "-" -> result = v1 - v2
            "*" -> result = v1 * v2
            "/" -> result = v1 / v2
        }
        return "$v1 $op $v2 = $result"
    }
}