package com.example.designpatternstudy.State

import android.util.Log

class DeadState(warrior: Warrior) : WarriorState {
    override fun printWarning() {
        Log.d("DeadState", "죽어있는 상대에게 공격할 수 없습니다.")
    }

    override fun getDamageSize(damage: Int): Int {
        return 0
    }

}