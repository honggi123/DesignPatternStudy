package com.example.designpatternstudy.Composite

import android.util.Log

class File(val fileName: String) : FolderComponent() {

    override fun printAllPath(path: String) {
        Log.d("filePath", path + "/" + fileName)
    }

    override fun countFile(): Int {
        return 1
    }

}