package com.example.designpatternstudy.State

import android.util.Log

class SafeHpState(private val warrior: Warrior) : WarriorState {
    override fun printWarning() {
        // 해당 state에서 불필요함
    }

    override fun getDamageSize(damage: Int): Int {
        return warrior._hp - (damage * 2)
    }


}