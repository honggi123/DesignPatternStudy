package com.example.designpatternstudy.Iterator

class BookShelf : Aggregate {

    private var list = mutableListOf<Book>()

    fun addBook(book: Book) {
        list.add(book)
    }

    override fun Iterator(): Iterator<Book> {
        return BookIterator(list)
    }
}