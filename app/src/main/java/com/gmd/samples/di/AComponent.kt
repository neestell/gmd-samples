package com.gmd.samples.di

import com.gmd.samples.presentation.APresenter
import dagger.Subcomponent


/**
 * @author neestell on 2020-02-10.
 */
//@OperationScope uncomment to share only for this
@Subcomponent
interface AComponent : OperationChooser {

    fun providePresenter(): APresenter

}