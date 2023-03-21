package com.example.designpatternstudy.State

import android.util.Log

class SafeHpState(private val warrior: Warrior) : WarriorState {

    override fun printWarning() {
        // 해당 state에서 불필요함
    }

    override fun computeHP(HP: Int, damageScore: Int): Int {
        return HP - damageScore
    }



}