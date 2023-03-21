package com.example.designpatternstudy.State

import android.util.Log

class LowHpState(private val warrior: Warrior) : WarriorState {
    override fun printWarning() {
        Log.d("LowHpState", "위험한 상태 입니다.")
        if (warrior.autoDrink){
            drink()
        }
    }

    override fun computeHP(HP: Int, damageScore: Int): Int {
        return HP - (damageScore * 2)
    }

    private fun drink(){
        Log.d("LowHpState", "자동으로 물약이 먹어집니다.")
    }



}