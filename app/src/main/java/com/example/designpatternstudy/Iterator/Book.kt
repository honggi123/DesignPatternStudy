package com.example.designpatternstudy.Iterator

data class Book(override var name: String, var cost: Int) : Product(name)
