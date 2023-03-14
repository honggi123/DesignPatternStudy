package com.example.designpatternstudy.Factory

import android.util.Log

abstract class Coffee {
    open protected var name : String = ""
    open protected var price : Int = 0
    open protected var sugar : Int = 0

    fun addIce(){
        Log.d("Coffee","아이스를 넣습니다.")
    }

    fun addWhipping(){
        Log.d("Coffee","휘핑 크림을 넣습니다.")
    }

    fun showDescription(){
        Log.d("Coffee","주문하신 커피 입니다. 이름 : $name 가격 : $price 당도 : $sugar")
    }

}