package com.example.designpatternstudy.Proxy.Protecting

interface RiderCommand {
    fun delivery(EXUser: Ex_User)
    fun getLatestDeliveredUser(EXUser: Ex_User)
}