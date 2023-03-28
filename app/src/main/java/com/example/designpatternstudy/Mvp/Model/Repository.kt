package com.example.designpatternstudy.Mvp.Model

class Repository {
    var user = User("")

    fun saveNickname(nickname: String) {
        user.nickname = nickname
    }

}