package com.example.observer_pattern

import android.util.Log

class ConcreteObserverA<T> : Observer<T> {

    override fun update(s: T) {
        Log.d("ConcreteObserverA",s.toString())
    }

}