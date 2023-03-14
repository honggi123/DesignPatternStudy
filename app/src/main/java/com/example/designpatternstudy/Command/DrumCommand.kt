package com.example.designpatternstudy.Command

class DrumCommand(private var soundDrum: SoundDrum) : SoundCommand{

    override fun excute() {
        System.out.println(soundDrum.playHigh() + soundDrum.playSmall())
    }

}