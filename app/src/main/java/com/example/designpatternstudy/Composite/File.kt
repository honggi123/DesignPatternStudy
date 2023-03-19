package com.example.designpatternstudy.Composite

import android.util.Log

class File : FolderComponent() {

    private var data: Int = 5

    override fun printAll() {
        Log.d("File", data.toString())
    }

    override fun sum(): Int = data

}