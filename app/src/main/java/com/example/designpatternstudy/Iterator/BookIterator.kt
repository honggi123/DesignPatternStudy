package com.example.designpatternstudy.Iterator

class BookIterator(private val list: List<Book>) : Iterator<Book> {

    private var position: Int = 0

    override fun hasNext(): Boolean {
        if (position >= list.size || list[position] == null) return false;
        else return true;
    }

    override fun next(): Book {
        var book = list.get(position)
        position++
        return book
    }

}