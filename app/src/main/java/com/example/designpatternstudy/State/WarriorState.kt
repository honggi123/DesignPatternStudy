package com.example.designpatternstudy.State

interface WarriorState {
    fun printWarning()
    fun takeDamage(HP: Int, damageScore: Int)
}
