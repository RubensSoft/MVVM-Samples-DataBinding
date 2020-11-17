package com.example.mvvmsample

import androidx.databinding.ObservableBoolean

// MainActivity & DataBindingActivity & TwoWayDataBindingActivity
// using ObservableBoolean

class ViewModel {
    private val userDetailsModel = UserDetailsModel()
    private var user: User
    val remember = ObservableBoolean(false)

    init {
        user = userDetailsModel.login()
        remember.set(user.rememberMe)
    }


    fun getName(): String {
        return user.name
    }

    fun getAge(): String {
        return user.age
    }
}
