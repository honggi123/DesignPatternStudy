package com.example.designpatternstudy.Composite

import kotlin.UnsupportedOperationException

abstract class FolderComponent(name: String) {

    open var ComponentName : String = name
    open var absolutelyPath : String = ""

    abstract fun printAll()

    open fun printFileNum() {
        throw UnsupportedOperationException()
    }

    open fun addComponent(folderComponent: FolderComponent) {
        throw UnsupportedOperationException()
    }

    abstract fun countFile(): Int

}