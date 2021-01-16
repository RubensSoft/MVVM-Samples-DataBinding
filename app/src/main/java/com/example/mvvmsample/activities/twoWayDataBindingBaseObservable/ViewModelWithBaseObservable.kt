package com.example.mvvmsample.activities.twoWayDataBindingBaseObservable

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.mvvmsample.BR
import com.example.mvvmsample.User
import com.example.mvvmsample.UserDetailsModel

// TwoWayDataBindingWithBaseObservableActivity
// using BaseObservable
// https://developer.android.com/topic/libraries/data-binding/two-way?hl=es-419

class ViewModelWithBaseObservable : BaseObservable() {
    private val userDetailsModel = UserDetailsModel()
    var user: User

    init {
        user = userDetailsModel.login()
    }

    @Bindable
    fun getRememberMe(): Boolean {
        return user.rememberMe
    }

    fun setRememberMe(value: Boolean) {
        if (user.rememberMe != value) {
            user.rememberMe = value

            // React to the change.
            //saveData()
            Log.d("i", "user.rememberMe value is " + user.rememberMe)

            notifyPropertyChanged(BR.rememberMe)
        }
    }

    fun changeRememberMe() {
        when (user.rememberMe) {
            true -> setRememberMe(false)
            false -> setRememberMe(true)
        }
    }
}