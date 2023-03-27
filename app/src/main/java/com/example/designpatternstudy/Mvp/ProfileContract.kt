package com.example.designpatternstudy.Mvp

import android.provider.ContactsContract
import com.example.designpatternstudy.Mvp.Model.User

interface ProfileContract {
    interface View {
        fun updateUserProfile(user: User)
    }

    interface Presenter {
        fun saveNickname(nickname: String)
        fun loadUser()
    }
}