package com.gmd.samples.di

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

    fun openAScope(): AComponent

    fun openBScope(): BComponent

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(context: Context): Builder

        fun build(): RootComponent
    }
}