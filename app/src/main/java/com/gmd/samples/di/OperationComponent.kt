package com.gmd.samples.di

import com.gmd.samples.presentation.OperationPresenter
import dagger.Subcomponent


/**
 * @author neestell on 2020-02-10.
 */
@Subcomponent
interface OperationComponent {
    fun providePresenter(): OperationPresenter
}