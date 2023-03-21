package com.example.designpatternstudy.State

import android.util.Log

class DeadState(private val warrior: Warrior) : WarriorState {
    override fun printWarning() {
        Log.d("DeadState", "죽어있는 상대에게 공격할 수 없습니다.")
    }

    override fun computeHP(HP: Int, damageScore: Int): Int {
        wantLiveState()
        return 0
    }

    private fun wantLiveState() {
        Log.d("DeadState", "살리시겠습니까?")
    }

}