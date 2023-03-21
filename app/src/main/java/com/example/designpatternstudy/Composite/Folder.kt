package com.example.designpatternstudy.Composite

import android.util.Log

class Folder(val folderName: String) : FolderComponent(folderName) {

    private val list: MutableList<FolderComponent> = mutableListOf()

    override fun printAll() {
        for (comp: FolderComponent in list) {
            var folderPath = super.absolutelyPath + folderName + "/"
            comp.absolutelyPath += folderPath
            comp.printAll()
        }
    }

    override fun printFileNum() {
        Log.d("Folder", "파일개수 : " + countFile().toString())
    }

    override fun addComponent(folderComponent: FolderComponent) {
        list.add(folderComponent)
    }

    override fun countFile(): Int {
        var filesCount = 0
        for (comp: FolderComponent in list) {
            filesCount += comp.countFile()
        }
        return filesCount
    }

}