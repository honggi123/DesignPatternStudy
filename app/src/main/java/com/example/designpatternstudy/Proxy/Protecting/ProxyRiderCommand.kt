package com.example.designpatternstudy.Proxy.Protecting

class ProxyRiderCommand : RiderCommand {

    private val riderCommand: RiderCommand by lazy { RiderCommandImpl() }

    override fun delivery(exUser: ExUser) {
        if (exUser.isBanned) System.out.println("${exUser.nickname}님은 배달을 받을 수 없습니다.")
        else riderCommand.delivery(exUser)
    }

    override fun getLatestDeliveredUser(exUser: ExUser) {
        if (exUser.isMaster) riderCommand.getLatestDeliveredUser(exUser)
        else System.out.println("${exUser.nickname}님은 해당 정보에 접근할 수 없습니다..")
    }

}