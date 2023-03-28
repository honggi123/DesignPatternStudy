package com.example.designpatternstudy.Proxy.Cache

import android.util.Log

class ImageProxy : Image {
    private var CachedImage: RealImage? = null

    private fun loadingImage() {
        Log.d("ImageProxy", "Loading Image")
    }

    override fun displayImage() {
        if (CachedImage == null) {
            loadingImage()
            CachedImage = RealImage()
        }
        CachedImage?.displayImage()

    }
}