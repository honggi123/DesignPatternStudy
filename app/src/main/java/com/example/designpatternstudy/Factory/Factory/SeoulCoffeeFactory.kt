package com.example.designpatternstudy.Factory

class SeoulCoffeeFactory : CoffeeFactory(){

    override fun makeCoffee(type: String): Coffee {
      return when(type){
           "아메리카노"->  SeoulAmericano()
            "모카"->  SeoulAmericano()
          else -> SeoulAmericano()
      }
    }
}