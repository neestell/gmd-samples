package com.gmd.samples.presentation

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType


/**
 * @author neestell on 2020-02-07.
 */
@StateStrategyType(AddToEndSingleStrategy::class)
interface ExpessionView : MvpView {
}