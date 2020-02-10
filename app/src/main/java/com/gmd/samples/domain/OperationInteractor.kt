package com.gmd.samples.domain

import com.gmd.samples.di.OperationScope
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.Subject
import javax.inject.Inject


/**
 * @author neestell on 2020-02-10.
 */
@OperationScope
class OperationInteractor @Inject constructor() {

    private val subject: Subject<String> = BehaviorSubject.create()

    fun listenOperations() = subject

    fun sendOperation(op: String) = subject.onNext(op);
}