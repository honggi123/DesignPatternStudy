package com.example.designpatternstudy.Composite

import android.util.Log

class Folder() : FolderComponent() {

    private val list: MutableList<FolderComponent> = mutableListOf()
    private var data: Int = 5

    override fun printAll() {
        for (comp: FolderComponent in list)
            comp.printAll()
    }

    override fun printSum() {
        Log.d("Folder", "Sum : " + sum().toString())
    }

    override fun addComponent(folderComponent: FolderComponent) {
        list.add(folderComponent)
    }

    override fun sum(): Int {
        var tempData : Int = data
        for (comp: FolderComponent in list){
            tempData += comp.sum()
        }
        return tempData
    }

}