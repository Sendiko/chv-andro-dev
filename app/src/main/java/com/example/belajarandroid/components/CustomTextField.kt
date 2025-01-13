package com.example.belajarandroid.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    label: String,
    hint: String,
    value: String,
    onValueChange: (String) -> Unit,
    leadingIcon:  @Composable (() -> Unit)
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge
        )
        OutlinedTextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            placeholder = {
                Text(text = hint)
            }
        )
    }
}