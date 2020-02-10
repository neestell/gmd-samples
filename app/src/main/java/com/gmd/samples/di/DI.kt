package com.gmd.samples.di

import android.content.Context
import com.gmd.samples.di.root.DaggerRootComponent
import com.gmd.samples.di.root.RootComponent


/**
 * @author neestell on 2020-02-10.
 */
object DI {

    private var rootComponent: RootComponent? = null


    fun openRootScope(context: Context): RootComponent {
        return rootComponent.thisOrNew {
            DaggerRootComponent.builder()
                .application(context.applicationContext)
                .build()
        }
            .also { rootComponent -> this.rootComponent = rootComponent }
    }
}

private inline fun <T> T?.thisOrNew(creator: () -> T): T {
    return this ?: creator.invoke()
}