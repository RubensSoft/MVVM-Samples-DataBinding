package com.example.mvvmsample

import androidx.databinding.ObservableBoolean

// using ObservableBoolean
class ViewModel {
    private val userDetailsModel = UserDetailsModel()
    private var user: User
    private val remember = ObservableBoolean(false)

    init {
        user = userDetailsModel.login()
        remember.set(user.rememberMe)
    }

    // MainActivity & DataBindingActivity
    fun getName(): String {
        return user.name
    }

    fun getAge(): String {
        return user.age
    }
}
