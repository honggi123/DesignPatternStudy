package com.example.designpatternstudy.State

import android.util.Log

class DeadState(private val warrior: Warrior) : WarriorState {
    override fun printWarning() {
        Log.d("DeadState", "죽어있는 상태 입니다.")
    }

    override fun takeDamage(HP: Int, damageScore: Int) {
        wantLiveState()
    }

    private fun wantLiveState() {
        Log.d("DeadState", "살리시겠습니까?")
    }

}