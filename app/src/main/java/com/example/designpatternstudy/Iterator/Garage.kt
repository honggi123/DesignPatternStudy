package com.example.designpatternstudy.Iterator

class Garage : Aggregate {

    private var list = mutableListOf<Car>()

    fun addCar(car: Car){
        list.add(car)
    }

    override fun createIterator(): Iterator<Car> {
        return CarIterator(list)
    }

}