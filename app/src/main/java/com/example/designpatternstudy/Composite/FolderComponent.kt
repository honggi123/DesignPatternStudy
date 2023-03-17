package com.example.designpatternstudy.Composite

import java.lang.UnsupportedOperationException

abstract class FolderComponent {

    abstract fun print()

    abstract fun addComponent(folderComponent: FolderComponent)

}