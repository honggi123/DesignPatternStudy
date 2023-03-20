package com.example.designpatternstudy.State

interface WarriorState {
    fun printWarning()
    fun getDamageSize(damage: Int): Int
}
