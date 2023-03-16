package com.example.designpatternstudy.Iterator

interface Aggregate {
    fun createIterator(): Iterator<Product>
}