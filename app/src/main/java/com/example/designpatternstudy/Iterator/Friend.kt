package com.example.designpatternstudy.Iterator

class Friend(private val bookShelf: Home, private val garage: Home) {

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