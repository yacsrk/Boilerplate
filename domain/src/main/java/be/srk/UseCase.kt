package be.srk

import rx.Observable

interface UseCase<T> {

    fun build(): Observable<T>
}
