package com.example.designpatternstudy.Proxy.Protecting

interface RiderCommand {
    fun delivery(EXUser: ExUser)
    fun getLatestDeliveredUser(EXUser: ExUser)
}