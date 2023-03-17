package com.example.designpatternstudy.Composite

import java.lang.UnsupportedOperationException

class File : FolderComponent() {

    private var content: String = ""
        set(value) {
            this.content = value
        }

    override fun print() = System.out.println(content)

    override fun addComponent(folderComponent: FolderComponent) {
        throw UnsupportedOperationException()
    }

}