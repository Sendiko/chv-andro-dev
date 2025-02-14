package com.example.belajarandroid.stateeventviewmodel

sealed interface LoginEvent {
    data class OnUsernameChanged(val username: String): LoginEvent
    data class OnPasswordChanged(val password: String): LoginEvent
    data class OnPasswordVisibilityChanged(val isVisible: Boolean): LoginEvent
    data object OnDismissDialog: LoginEvent
    data object OnLogin: LoginEvent
}