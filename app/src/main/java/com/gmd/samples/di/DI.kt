package com.gmd.samples.di

import android.content.Context


/**
 * @author neestell on 2020-02-10.
 */
object DI {

    private var rootComponent: RootComponent? = null
    private var aComponent: AComponent? = null
    private var bComponent: BComponent? = null


    fun openRootScope(context: Context): RootComponent {
        return rootComponent.thisOrNew {
            DaggerRootComponent.builder()
                .application(context.applicationContext)
                .build()
        }
            .also { rootComponent -> this.rootComponent = rootComponent }
    }

    fun plusAComponent(): AComponent = aComponent.thisOrNew {
        rootComponent!!.openAScope()
    }
        .also { aComponent -> this.aComponent = aComponent }

    fun plusBComponent(): BComponent = bComponent.thisOrNew {
        rootComponent!!.openBScope()
    }
        .also { bComponent -> this.bComponent = bComponent }

    fun openOperationChooserScope(): OperationComponent {
        var opChooser: OperationComponent? = null

        if (aComponent != null) {
            opChooser = aComponent!!.plusOperationComponent();
        }
        if (bComponent != null) {
            opChooser = bComponent!!.plusOperationComponent();
        }

        return opChooser!!;
    }

}

private inline fun <T> T?.thisOrNew(creator: () -> T): T {
    return this ?: creator.invoke()
}