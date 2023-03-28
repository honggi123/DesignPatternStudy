package com.example.designpatternstudy.Proxy.Cache

import android.util.Log

class RealImage : Image {
    override fun displayImage() {
        Log.d("RealImage", "Displaying Image")
    }
}