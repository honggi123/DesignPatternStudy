package com.example.designpatternstudy.Proxy.Protecting

class RiderCommandImpl : RiderCommand {
    private var deliveredEXUsers : MutableList<Ex_User> = mutableListOf()

    override fun delivery(EXUser: Ex_User) {
        System.out.println("${EXUser.nickname}에게 배달합니다..")
        deliveredEXUsers.add(EXUser)
    }

    override fun getLatestDeliveredUser(EXUser: Ex_User) {
        System.out.println("마지막 배달 회원 : ${deliveredEXUsers.last().nickname}")
    }

}