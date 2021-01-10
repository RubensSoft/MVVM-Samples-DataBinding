package com.example.mvvmsample

import android.util.Log
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

    fun setRememberMe() {
        when (user.rememberMe) {
            true -> {
                user.rememberMe = false
                remember.set(false)
            }
            false -> {
                user.rememberMe = true
                remember.set(true)
            }
        }
        Log.d("i", "user.rememberMe value is " + user.rememberMe)
    }
}
