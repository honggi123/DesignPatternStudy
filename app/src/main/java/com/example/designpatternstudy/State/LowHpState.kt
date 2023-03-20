package com.example.designpatternstudy.State

import android.util.Log

class LowHpState(private val warrior: Warrior) : WarriorState {
    override fun printWarning() {
        Log.d("LowHpState", "위험한 상태 입니다.")
    }

    override fun getDamageSize(damage: Int): Int {
        return warrior._hp - (damage * 2)
    }


}