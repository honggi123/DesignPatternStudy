package com.example.designpatternstudy.Iterator

class Waitress(private val bookShelf: Aggregate, private val garage: Aggregate) {

    fun printProduct() {
        var bookIterator = bookShelf.createIterator()
        var carIterator = garage.createIterator()
        printProductIterator(bookIterator)
        printProductIterator(carIterator)
    }

    private fun printProductIterator(iterator: Iterator<Product>) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name)
        }
    }


}