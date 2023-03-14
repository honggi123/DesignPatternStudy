package com.example.designpatternstudy.Adapter

class FormatAdapter(val mp3Player: Mp3Player) : Mp4 {

    override fun playSong() {
        mp3Player.playSong()
    }

    override fun displayVideo() {
        throw UnsupportedOperationException()
    }

}