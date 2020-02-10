package com.gmd.samples.di

import com.gmd.samples.presentation.APresenter
import dagger.Subcomponent


/**
 * @author neestell on 2020-02-10.
 */
@OperationScope
@Subcomponent
interface AComponent : OperationChooser {
    fun providePresenter(): APresenter

}