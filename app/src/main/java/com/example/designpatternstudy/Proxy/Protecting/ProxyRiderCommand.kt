package com.example.designpatternstudy.Proxy.Protecting

class ProxyRiderCommand : RiderCommand {
    var riderCommand: RiderCommandImpl = RiderCommandImpl()

    override fun delivery(user: User) {
        if (!user.banned) riderCommand.delivery(user)
    }

    override fun latestDeliveredUser(user: User) {
        if (!user.isMaster) riderCommand.latestDeliveredUser(user)
    }

}