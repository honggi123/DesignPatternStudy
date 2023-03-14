package com.example.designpatternstudy.Command

class PianoCommand(private var soundPiano : SoundPiano) : SoundCommand{

    override fun excute() {
       System.out.println(soundPiano.playHigh() + soundPiano.playSmall())
    }

}