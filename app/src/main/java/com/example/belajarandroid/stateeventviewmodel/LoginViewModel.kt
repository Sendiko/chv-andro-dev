package com.example.belajarandroid.stateeventviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel() {

    private val _state = MutableStateFlow(LoginState())
    val state = _state.asStateFlow()

    fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.OnUsernameChanged -> changeUsername(event.username)
            is LoginEvent.OnPasswordChanged -> changePassword(event.password)
            is LoginEvent.OnPasswordVisibilityChanged -> changePasswordVisibility(event.isVisible)
            LoginEvent.OnDismissDialog -> dismissDialog()
            LoginEvent.OnLogin -> login()
        }
    }

    private fun dismissDialog() {
        _state.update {
            it.copy(isError = false, isSuccess = false, message = "")
        }
    }

    private fun login() {
        if (_state.value.username.isBlank()) {
            _state.update {
                it.copy(
                    isError = true, message = "Username tidak boleh kosong"
                )
            }
            return
        }
        if (_state.value.password.isBlank()) {
            _state.update {
                it.copy(
                    isError = true, message = "Password tidak boleh kosong"
                )
            }
            return
        }
        _state.update {
            it.copy(
                isSuccess = true,
                message = "${_state.value.username} berhasil login."
            )
        }
    }

    private fun changeUsername(username: String) {
        _state.update {
            it.copy(username = username)
        }
    }

    private fun changePassword(password: String) {
        _state.update {
            it.copy(password = password)
        }
    }

    private fun changePasswordVisibility(visible: Boolean) {
        _state.update {
            it.copy(isPasswordVisible = visible)
        }
    }

}