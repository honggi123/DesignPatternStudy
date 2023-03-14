package com.example.observer_pattern

class ConcreteSubject<T>(_word:T) : Subject<T> {

    private val observers: MutableList<Observer<T>> =  mutableListOf<Observer<T>>()

    var word : T = _word
        set(value){
            field = value
            notifyObservers()
        }

    override fun registerObserver(o: Observer<T>) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer<T>) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for(o : Observer<T> in observers){
            o.update(word)
        }
    }

}