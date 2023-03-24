package com.example.designpatternstudy.Proxy.Protecting

interface RiderCommand {
    fun delivery(user: User)
    fun latestDeliveredUser(user: User)
}