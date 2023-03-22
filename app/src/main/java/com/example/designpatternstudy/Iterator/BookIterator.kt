package com.example.designpatternstudy.Iterator

class BookIterator(private val list: List<Book>) : Iterator<Book> {

    private var position: Int = 0

    override fun hasNext(): Boolean = position < list.size

    override fun next(): Book {
        return list.get(position++)
    }

}