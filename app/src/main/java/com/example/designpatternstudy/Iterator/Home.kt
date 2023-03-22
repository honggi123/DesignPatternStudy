package com.example.designpatternstudy.Iterator

class Home(private val bookShelf: Aggregate, private val garage: Aggregate) {

    fun printProduct() {
        bookShelf.Iterator().print()
        garage.Iterator().print()
    }

    private fun Iterator<Product>.print() {
        forEach { println(it.name) }
    }

}