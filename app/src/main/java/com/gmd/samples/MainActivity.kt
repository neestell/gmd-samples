package com.gmd.samples

import android.os.Bundle
import com.gmd.samples.di.DI
import moxy.MvpAppCompatActivity
import moxy.MvpView

class MainActivity : MvpAppCompatActivity(), MvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DI.openRootScope(applicationContext)
            .inject(this)
        setContentView(R.layout.activity_main)

    }
}
