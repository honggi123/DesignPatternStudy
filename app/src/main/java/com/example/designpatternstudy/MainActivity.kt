package com.example.designpatternstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.designpatternstudy.Adapter.FormatAdapter
import com.example.designpatternstudy.Adapter.Mp3Player
import com.example.designpatternstudy.Command.*
import com.example.designpatternstudy.Composite.File
import com.example.designpatternstudy.Composite.Folder
import com.example.designpatternstudy.Composite.FolderComponent
import com.example.designpatternstudy.Decorator.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Observer

//        var sub = ConcreteSubject("first")
//        sub.registerObserver(ConcreteObserverA())
//        sub.registerObserver(ConcreteObserverB())
//
//        sub.word = "second word"
//        sub.word = "third word"
//
//        var sub2 = ConcreteSubject(1)
//        sub2.registerObserver(ConcreteObserverA())
//        sub2.registerObserver(ConcreteObserverB())
//
//        sub2.word = 2
//        sub2.word = 3

//        Decorator

//        var coffee = Coffee("Lee")
//        val milkCoffee = MilkDecorator(coffee)
//
//        Log.d("MainActivity",milkCoffee.description)
//        Log.d("MainActivity","커피 가격은 "+ milkCoffee.getCost() +"입니다.")

//        Factory

//        var busanCoffeeFactory = BusanCoffeeFactory()
//        var mycoffee = busanCoffeeFactory.order("아메리카노")

//        var seoulCoffeeFactory = SeoulCoffeeFactory()
//        var mycoffee2 =seoulCoffeeFactory.order("아메리카노")

//        Command

//        var mp3 = Mp3()
//        mp3.updateSound(DrumCommand(SoundDrum()))
//        mp3.updateSound(PianoCommand(SoundPiano()))
//
//        mp3.playSound()
//        mp3.nextSoundPlay()
//        mp3.prevSoundPlay()

//        Adapter
//         var mp3Player = Mp3Player()
//         var mp4Player = FormatAdapter(mp3Player)
//         mp4Player.playSong()
//         mp4Player.displayVideo()

//        Composite
        var subFolder: FolderComponent = Folder("folder2")
        subFolder.addComponent(File("file4"))
        subFolder.addComponent(File("file5"))
        subFolder.addComponent(File("file6"))
        subFolder.addComponent(File("file7"))

        var superFolder: FolderComponent = Folder("folder1")

        superFolder.addComponent(File("file1"))
        superFolder.addComponent(File("file2"))
        superFolder.addComponent(File("file3"))
        superFolder.addComponent(subFolder)

        superFolder.printFileNum()

        superFolder.printFilesPath()

    }
}