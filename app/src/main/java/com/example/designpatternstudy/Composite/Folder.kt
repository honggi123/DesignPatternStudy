package com.example.designpatternstudy.Composite

import android.util.Log

class Folder(val folderName: String) : FolderComponent() {

    private val list: MutableList<FolderComponent> = mutableListOf()

    override fun printFilesPath() {
        printAllPath("")
    }

    override fun printAllPath(path: String) {
        for (comp: FolderComponent in list) {
            var folderPath = path + "/" + folderName
            comp.printAllPath(folderPath)
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