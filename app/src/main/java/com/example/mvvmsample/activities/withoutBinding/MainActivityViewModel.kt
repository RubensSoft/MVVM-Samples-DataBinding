package com.example.mvvmsample.activities.withoutBinding

import android.util.Log
import androidx.databinding.ObservableBoolean
import com.example.mvvmsample.User
import com.example.mvvmsample.UserDetailsModel

class MainActivityViewModel {
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

    fun getRememberMe(): Boolean {
        return user.rememberMe
    }

    fun changeUser() {
        when (user.name) {
            "Pepito" -> user = User(
                "Margarita",
                "22",
                false
            )
            "Margarita" -> user = User(
                "Pepito",
                "31",
                true
            )
        }
    }
}