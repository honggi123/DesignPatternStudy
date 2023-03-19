package com.example.designpatternstudy.Composite

import android.util.Log

class Folder() : FolderComponent() {

    private val list: MutableList<FolderComponent> = mutableListOf()
    private var data: Int = 0

    override fun printAll() {
        for (comp: FolderComponent in list)
            comp.printAll()
    }

    override fun printSum() {
        sum()
        Log.d("Folder", "Sum : " + data.toString())
    }

    override fun addComponent(folderComponent: FolderComponent) {
        list.add(folderComponent)
    }

    override fun sum(): Int {
        for (comp: FolderComponent in list)
            data += comp.sum()
        return data
    }

}