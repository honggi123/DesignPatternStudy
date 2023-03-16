package com.example.designpatternstudy.Iterator

class CarIterator(private val list: MutableList<Car>) : Iterator<Car> {

    private var position: Int = 0

    override fun hasNext(): Boolean {
        if (position >= list.size || list[position] == null) return false;
        else return true;
    }

    override fun next(): Car {
        var car = list.get(position)
        position++
        return car
    }
}