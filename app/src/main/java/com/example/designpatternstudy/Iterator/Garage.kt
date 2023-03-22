package com.example.designpatternstudy.Iterator

class Garage : Aggregate {

    private var set = HashSet<Car>()

    fun addCar(car: Car) {
        set.add(car)
    }

    override fun Iterator(): Iterator<Car> {
        return CarIterator(set)
    }

}