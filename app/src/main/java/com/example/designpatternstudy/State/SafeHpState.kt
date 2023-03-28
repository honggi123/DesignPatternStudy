package com.example.designpatternstudy.State

import android.util.Log

class SafeHpState(private val warrior: Warrior) : WarriorState {

    override fun printWarning() {
        // 해당 state에서 불필요함
    }

    override fun takeDamage(HP: Int, damageScore: Int) {
        val hp = HP - damageScore
        warrior.HP = hp
        if (hp <= 0) warrior.state = warrior.deadState
        else if (hp <= 30) warrior.state = warrior.lowHpState
    }


}