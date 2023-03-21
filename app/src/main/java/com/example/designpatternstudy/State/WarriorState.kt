package com.example.designpatternstudy.State

interface WarriorState {
    fun printWarning()
    fun computeHP(HP: Int, damageScore: Int): Int
}
