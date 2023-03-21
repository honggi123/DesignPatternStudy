package com.example.designpatternstudy.State

class Warrior(private var HP: Int) {

    val deadState: DeadState = DeadState(this)
    val lowHpState: LowHpState = LowHpState(this)
    val safeHpState: SafeHpState = SafeHpState(this)

    var autoDrink : Boolean = false

    lateinit var state: WarriorState

    init {
        computeState()
    }

    fun attacked(damageScore: Int) {
        HP = state.computeHP(HP, damageScore)
        computeState()
        state.printWarning()
    }

    private fun computeState(){
        if (HP <= 0) state = deadState
        else if (HP <= 50) state = lowHpState
        else state = safeHpState
    }


}