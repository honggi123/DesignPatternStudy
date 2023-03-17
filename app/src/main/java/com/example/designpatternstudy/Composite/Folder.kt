package com.example.designpatternstudy.Composite

class Folder(private var list: MutableList<FolderComponent>) : FolderComponent() {

    override fun print() {
        for (comp: FolderComponent in list)
            comp.print()
    }

    override fun addComponent(folderComponent: FolderComponent) {
        list.add(folderComponent)
    }

}