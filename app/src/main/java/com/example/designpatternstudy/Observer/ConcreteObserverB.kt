package com.example.observer_pattern

import android.util.Log

class ConcreteObserverB<T> : Observer<T> {

    override fun update(s: T) {
        Log.d("ConcreteObserverB",s.toString())
    }

}