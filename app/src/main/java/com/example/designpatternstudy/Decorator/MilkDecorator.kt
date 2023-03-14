package com.example.designpatternstudy.Decorator


class MilkDecorator(private var coffee:Beverage) : BeverageDecorator() {

    override fun description(): String = coffee.description + "/ 우유를 추가 했습니다."

    override fun cost(): Int = coffee.cost() + 3000

}