package com.example.designpatternstudy.Iterator

interface Aggregate {
    fun Iterator(): Iterator<Product>
}