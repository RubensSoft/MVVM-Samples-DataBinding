package com.example.mvvmsample

class UserDetailsModel {
    fun login(): User  {
        return User("Pepito","31",true)
    }
}

data class User (
    val name: String,
    val age: String,
    var rememberMe: Boolean
)