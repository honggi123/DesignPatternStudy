package com.example.designpatternstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.designpatternstudy.Proxy.Protecting.ExUser
import com.example.designpatternstudy.Proxy.Protecting.ProxyRiderCommand


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
//
//        var mp3 = Mp3()
//        mp3.updateSound(DrumCommand(SoundDrum()))
//        mp3.updateSound(PianoCommand(SoundPiano()))
//
//        mp3.playSound()
//        mp3.nextSoundPlay()
//        mp3.prevSoundPlay()
//
//        Adapter
//
//        var mp3Player = Mp3Player()
//        var mp4Player = FormatAdapter(mp3Player)
//        mp4Player.playSong()
//        mp4Player.displayVideo()

//        Iterator
//        예시 데이터
//        var bookShelf = BookShelf()
//        bookShelf.addBook(Book("책1"))
//        bookShelf.addBook(Book("책2"))
//        bookShelf.addBook(Book("책3"))
//
//        var garage = Garage()
//        garage.addCar(Car("차1"))
//        garage.addCar(Car("차2"))
//
//        var home = Home(bookShelf,garage)
//        home.printProduct()


//        Composite
//        var subFolder: FolderComponent = Folder("folder2")
//        subFolder.addComponent(File("file4"))
//        subFolder.addComponent(File("file5"))
//        subFolder.addComponent(File("file6"))
//        subFolder.addComponent(File("file7"))
//
//        var superFolder: FolderComponent = Folder("folder1")
//
//        superFolder.addComponent(File("file1"))
//        superFolder.addComponent(File("file2"))
//        superFolder.addComponent(File("file3"))
//        superFolder.addComponent(subFolder)
//
//        superFolder.printFileNum()
//
//        superFolder.printFilesPath()
//
//        var chicken = Chicken()
//        chicken.prepareFood(DelieverDistance.Long)

//        Proxy
//        var imageProxy = ImageProxy()
//        imageProxy.displayImage()
//        imageProxy.displayImage()

        var proxyRiderCommand = ProxyRiderCommand()
        proxyRiderCommand.delivery(ExUser("honggi1",false,true))
        proxyRiderCommand.delivery(ExUser("honggi2",false,false))

        proxyRiderCommand.getLatestDeliveredUser(ExUser("honggi3",false))
        proxyRiderCommand.getLatestDeliveredUser(ExUser("honggi4",true))

    }
}