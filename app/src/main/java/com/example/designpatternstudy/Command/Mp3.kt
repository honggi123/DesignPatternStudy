package com.example.designpatternstudy.Command

import android.util.Log

class Mp3{

    private var currentSongNum = 0
    private var songList = mutableListOf<SoundCommand>()

    private enum class Orders() {
        Next,
        Prev,
        End
    }

    fun playSound(){
        songList.get(currentSongNum).excute()
    }

    fun nextSoundPlay(){
        currentSongNum  = calculateSongNum(Orders.Next,currentSongNum)
        songList.get(currentSongNum).excute()
    }

    fun prevSoundPlay(){
        currentSongNum  = calculateSongNum(Orders.Prev,currentSongNum)
        songList.get(currentSongNum).excute()
    }

    fun updateSound(sound :SoundCommand){
        songList.add(sound)
    }

    private fun calculateSongNum(order : Orders,current : Int) : Int{
        var now = current
        when(order){
            Orders.Next -> now++
            Orders.Prev -> now--
        }

        if (current >= songList.size){
            now = 0
        }else if(current < 0){
            now = songList.size - 1
        }

       return now
    }

}