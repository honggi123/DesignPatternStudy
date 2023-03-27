package com.example.designpatternstudy.Mvp.View

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatternstudy.Mvp.Model.User
import com.example.designpatternstudy.Mvp.Presenter.ProfilePresenter
import com.example.designpatternstudy.Mvp.ProfileContract
import com.example.designpatternstudy.R

class ProfileActivity : AppCompatActivity(), ProfileContract.View {

    private lateinit var view_nickname: TextView
    private lateinit var btn_loadProfile: Button
    private lateinit var btn_saveNickname: Button

    private val presenter: ProfileContract.Presenter = ProfilePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        view_nickname = findViewById(R.id.textview_nickname)
        btn_loadProfile = findViewById(R.id.button_load)
        btn_saveNickname = findViewById(R.id.button_saveExNickname)

        btn_loadProfile.setOnClickListener {
            presenter.loadUser()
        }

        btn_saveNickname.setOnClickListener {
            presenter.saveNickname("치즈라면")
        }

    }

    override fun updateUserProfile(user: User) {
        view_nickname.setText(user.nickname)
    }

}