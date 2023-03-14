package com.example.designpatternstudy.Decorator

abstract class Beverage() {

    open val description : String = "";

    abstract fun cost() : Int
}