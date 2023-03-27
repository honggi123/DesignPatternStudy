package com.example.designpatternstudy.Proxy.Protecting

class ProxyRiderCommand : RiderCommand {
    private var riderCommand: RiderCommandImpl = RiderCommandImpl()

    override fun delivery(EXUser: Ex_User) {
        if (EXUser.isBanned) System.out.println("${EXUser.nickname}님은 배달을 받을 수 없습니다.")
        else riderCommand.delivery(EXUser)
    }

    override fun getLatestDeliveredUser(EXUser: Ex_User) {
        if (EXUser.isMaster) riderCommand.getLatestDeliveredUser(EXUser)
        else System.out.println("${EXUser.nickname}님은 해당 정보에 접근할 수 없습니다..")
    }

}