package com.example.designpatternstudy.Proxy.Protecting

class RiderCommandImpl : RiderCommand {
    var deliveredUsers : MutableList<User> = mutableListOf()

    override fun delivery(user: User) {
        System.out.println("${user.nickname}에게 배달합니다..")
        deliveredUsers.add(user)
    }

    override fun latestDeliveredUser(user: User) {
        System.out.println("${deliveredUsers.last()}")
    }

}