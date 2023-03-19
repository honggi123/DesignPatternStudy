package com.example.designpatternstudy.Composite

import kotlin.UnsupportedOperationException

abstract class FolderComponent {

    abstract fun printAll()

    open fun printSum() {
        throw UnsupportedOperationException()
    }

    open fun addComponent(folderComponent: FolderComponent) {
        throw UnsupportedOperationException()
    }

    abstract fun sum(): Int

}