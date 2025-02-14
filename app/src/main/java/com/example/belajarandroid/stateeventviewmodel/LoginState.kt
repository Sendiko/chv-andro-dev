package com.example.belajarandroid.stateeventviewmodel

data class LoginState(
    val username: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val isPasswordVisible: Boolean = false,
    val isSuccess: Boolean = false,
    val isError: Boolean = false,
    val message: String = ""
)
