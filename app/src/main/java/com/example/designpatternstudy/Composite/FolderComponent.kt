package com.example.designpatternstudy.Composite

import kotlin.UnsupportedOperationException

abstract class FolderComponent() {

    abstract fun printAllPath(path: String)

    open fun printFilesPath() {
        throw UnsupportedOperationException()
    }

    open fun printFileNum() {
        throw UnsupportedOperationException()
    }

    open fun addComponent(folderComponent: FolderComponent) {
        throw UnsupportedOperationException()
    }

    abstract fun countFile(): Int

}