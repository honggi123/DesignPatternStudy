package com.example.designpatternstudy.TemplateMethod

class Chicken : FoodMaker() {

    override fun prepareCondiments() {
        System.out.println("닭을 준비합니다.")
    }

    override fun cook() {
        System.out.println("닭을 자릅니다.")
    }

    override fun cutCondiments() {
        System.out.println("닭을 자릅니다.")
    }

    override fun putSideCooking() {
        System.out.println("무를 넣습니다.")
    }


}