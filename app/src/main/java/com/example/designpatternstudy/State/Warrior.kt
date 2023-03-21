package com.example.designpatternstudy.State

class Warrior(private var HP: Int) {

    val deadState: DeadState = DeadState(this)
    val lowHpState: LowHpState = LowHpState(this)
    val safeHpState: SafeHpState = SafeHpState(this)

    var autoDrink : Boolean = false

    lateinit private var state: WarriorState

    init {
        selectState()
    }

    fun takeDamage(damageScore: Int) {
        HP = state.computeHP(HP, damageScore)
        selectState()
        state.printWarning()
    }

    private fun selectState(){
        if (HP <= 0) state = deadState
        else if (HP <= 30) state = lowHpState
        else state = safeHpState
    }


}