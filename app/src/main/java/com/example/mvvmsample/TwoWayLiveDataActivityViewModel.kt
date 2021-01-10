package com.example.mvvmsample

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayLiveDataActivityViewModel: ViewModel() {
    private val userDetailsModel = UserDetailsModel()
    private var user = MutableLiveData<User>()

    init {
        user.value = userDetailsModel.login()
    }

    fun getUser(): User? {
        return user.value
    }

    fun getUserLiveData(): MutableLiveData<User> {
        return user
    }

    fun setRememberMe() {
        when (user.value?.rememberMe) {
            true -> user.value?.rememberMe = false
            false -> user.value?.rememberMe = true
        }
        Log.d("i", "user.rememberMe value is : " + user.value?.rememberMe)
    }

    fun changeUser() {
        when (user.value?.name) {
            "Pepito" -> user.value = User(
                "Margarita",
                "22",
                false
            )
            "Margarita" -> user.value = User(
                "Pepito",
                "31",
                true
            )
        }
    }
}