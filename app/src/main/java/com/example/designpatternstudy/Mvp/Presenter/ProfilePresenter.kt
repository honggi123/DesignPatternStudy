package com.example.designpatternstudy.Mvp.Presenter

import com.example.designpatternstudy.Mvp.Model.Repository
import com.example.designpatternstudy.Mvp.ProfileContract

class ProfilePresenter(private var view: ProfileContract.View) : ProfileContract.Presenter {

    private var repository = Repository()

    override fun saveNickname(nickname: String) = repository.saveNickname(nickname)

    override fun loadUser() = view.updateUserProfile(repository.user)

}