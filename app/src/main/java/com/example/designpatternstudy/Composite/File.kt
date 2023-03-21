package com.example.designpatternstudy.Composite

import android.util.Log

class File(val fileName: String) : FolderComponent(fileName) {

    override fun printAll() {
        super.absolutelyPath += fileName
        Log.d("filePath", absolutelyPath)
    }

    override fun countFile(): Int {
        return 1
    }

}