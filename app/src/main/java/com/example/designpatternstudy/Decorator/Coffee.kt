package com.example.designpatternstudy.Decorator

class Coffee(private val nickname: String) : Beverage(){

    override val description: String = nickname+"의 커피 입니다."

    override fun cost() = 5000
}