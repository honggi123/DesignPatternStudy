package com.example.designpatternstudy.TemplateMethod

class Pizza : FoodMaker() {

    override fun cook() {
        System.out.println("오븐에 넣기")
    }

    override fun cutCondiments() {
        System.out.println("빵을 자릅니다.")
    }

    override fun putSideCooking() {
    }

    override fun prepareCondiments() {
        System.out.println("빵을 준비합니다.")
        System.out.println("소세지를 준비합니다.")
    }


}