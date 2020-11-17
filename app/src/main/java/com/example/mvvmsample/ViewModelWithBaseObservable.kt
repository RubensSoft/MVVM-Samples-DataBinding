package com.example.mvvmsample

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

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
        // Avoids infinite loops.
        if (user.rememberMe != value) {
            user.rememberMe = value
            // React to the change.
            //saveData()
            // Notify observers of a new value.
            //notifyPropertyChanged()
        }
    }

}