package com.example.designpatternstudy.Iterator

class CarIterator(private val set: HashSet<Car>) : Iterator<Car> {

    private var position: Int = 0

    override fun hasNext(): Boolean = position < set.size

    override fun next(): Car {
        return set.elementAt(position++)
    }

}