package com.gmd.samples.di.root

import android.content.Context
import com.gmd.samples.MainActivity
import dagger.BindsInstance
import dagger.Component


/**
 * @author neestell on 2020-02-10.
 */
@Component
interface RootComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(context: Context): Builder

        fun build(): RootComponent
    }
}