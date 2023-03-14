package com.example.designpatternstudy.Factory


abstract class CoffeeFactory {

    fun order(type : String) : Coffee {
        var coffee = makeCoffee(type)
        coffee.addIce()
        coffee.addWhipping()
        coffee.showDescription()

        return coffee
    }

    protected abstract fun makeCoffee(type:String) : Coffee

}