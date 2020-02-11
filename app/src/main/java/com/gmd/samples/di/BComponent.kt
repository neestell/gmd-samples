package com.gmd.samples.di

import com.gmd.samples.presentation.BPresenter
import dagger.Subcomponent


/**
 * @author neestell on 2020-02-10.
 */
//@OperationScope uncomment to share only for this
@Subcomponent
interface BComponent : OperationChooser {

    fun providePresenter(): BPresenter

}