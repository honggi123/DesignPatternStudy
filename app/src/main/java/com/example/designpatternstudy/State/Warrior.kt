package com.example.designpatternstudy.State

class Warrior(private var hp: Int) {

    private val deadState: DeadState = DeadState(this)
    private val lowHpState: LowHpState = LowHpState(this)
    private val safeHpState: SafeHpState = SafeHpState(this)

    val _hp: Int
        get() {
            return hp
        }

    lateinit var state: WarriorState

    init {
        changeState(hp)
    }

    fun attacked(damage: Int) {
        changeDamagedHp(damage)
        changeState(hp)
        state.printWarning()
    }

    private fun changeDamagedHp(damage: Int) {
        hp -= state.getDamageSize(damage)
    }

    private fun changeState(hp: Int) {
        if (hp <= 30) {
            state = lowHpState
        } else if (0 <= hp) {
            state = deadState
        } else {
            state = safeHpState
        }
    }


}