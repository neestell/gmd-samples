package com.gmd.samples

import android.os.Bundle
import com.gmd.samples.di.DI
import moxy.MvpAppCompatActivity
import moxy.MvpView

class MainActivity : MvpAppCompatActivity(), MvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DI.openRootScope(applicationContext)
            .inject(this)
    }
}
