package com.example.designpatternstudy.TemplateMethod

enum class DelieverDistance {
    Short,
    Long
}

abstract class FoodMaker {

    fun prepareFood(distance: DelieverDistance) {
        prepareCondiments()
        cutCondiments()
        cook()

        when (distance) {
            DelieverDistance.Short -> {
                boxingLowDistance()
            }
            DelieverDistance.Long -> {
                boxingLongDistance()
            }
        }

        if(IsChicken()){
            putSideCooking()
        }

    }

    protected abstract fun prepareCondiments()
    protected abstract fun cook()
    protected abstract fun cutCondiments()
    protected abstract fun putSideCooking()

    private fun boxingLowDistance() {
        System.out.println("일반 박스에 넣습니다.")
    }

    private fun boxingLongDistance() {
        System.out.println("온열 박스로 포장합니다.")
    }

    protected open fun IsChicken() = false

}