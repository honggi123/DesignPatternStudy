package com.example.designpatternstudy.Decorator

class ChocoDecorator(private var coffee:Beverage) : BeverageDecorator() {

    override fun description(): String = coffee.description + "/ 초코를 추가 했습니다."

    override fun cost(): Int = coffee.cost() + 5000

}