package com.example.designpatternstudy.TemplateMethod

enum class DelieverDistance {
    Short,
    Long
}

abstract class FoodMaker {

    fun prepareFood(distance: DelieverDistance) {
        noticePrepare()
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


        putSideCooking()


    }

    private fun noticePrepare() {
        System.out.println("음식을 준비하겠습니다.")
    }

    protected abstract fun prepareCondiments()
    protected abstract fun cook()
    protected abstract fun cutCondiments()
    protected open fun putSideCooking() {}

    private fun boxingLowDistance() {
        System.out.println("일반 박스에 넣습니다.")
    }

    private fun boxingLongDistance() {
        System.out.println("온열 박스로 포장합니다.")
    }


}