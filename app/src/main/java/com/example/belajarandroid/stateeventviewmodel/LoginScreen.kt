package com.example.belajarandroid.stateeventviewmodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.belajarandroid.components.CustomTextField
import com.example.belajarandroid.stateeventviewmodel.components.ErrorDialog
import com.example.belajarandroid.stateeventviewmodel.components.SuccessDialog
import kotlinx.coroutines.delay

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginState,
    onEvent: (LoginEvent) -> Unit
) {
    LaunchedEffect(state.isSuccess) {
        if (state.isSuccess) {
            delay(3000)
            onEvent(LoginEvent.OnDismissDialog)
        }
    }
    LaunchedEffect(state.isError) {
        if (state.isError) {
            delay(3000)
            onEvent(LoginEvent.OnDismissDialog)
        }
    }
    Box {
        if (state.isSuccess) {
            SuccessDialog(
                message = state.message,
                onDismiss = { onEvent(LoginEvent.OnDismissDialog) }
            )
        }
        if (state.isError) {
            ErrorDialog(
                message = state.message,
                onDismiss = { onEvent(LoginEvent.OnDismissDialog) }
            )
        }
        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Login",
                    fontSize = 24.sp
                )
                Text(
                    text = "Login menggunakan username dan password anda.",
                )
                CustomTextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = "Username",
                    hint = "Masukkan username anda",
                    value = state.username,
                    onValueChange = { text ->
                        onEvent(LoginEvent.OnUsernameChanged(text))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Username"
                        )
                    }
                )
                CustomTextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = "Password",
                    hint = "Masukkan password anda",
                    value = state.password,
                    onValueChange = { text ->
                        onEvent(LoginEvent.OnPasswordChanged(text))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Password"
                        )
                    }
                )
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        onEvent(LoginEvent.OnLogin)
                    }
                ) {
                    Text(text = "Login")
                }
            }
        }
    }
}

@Preview
@Composable
private fun LoginScreenPrev() {
    val viewModel = viewModel<LoginViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()
    LoginScreen(
        state = state,
        onEvent = viewModel::onEvent
    )
}