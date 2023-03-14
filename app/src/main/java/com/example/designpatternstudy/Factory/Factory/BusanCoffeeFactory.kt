package com.example.designpatternstudy.Factory

class BusanCoffeeFactory : CoffeeFactory(){

    override fun makeCoffee(type: String): Coffee {
        return when(type){
            "아메리카노"->  BusanAmericano()
             "모카"->  BusanMocha()
            else -> BusanMocha()
        }
    }
}

