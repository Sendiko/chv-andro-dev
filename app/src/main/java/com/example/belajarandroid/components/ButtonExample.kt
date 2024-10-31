package com.example.belajarandroid.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExample(
    modifier: Modifier = Modifier,
    text: String
) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
        Button(
            onClick = { },
            enabled = false,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
        Button(
            onClick = { },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
        Button(
            onClick = { },
            elevation = ButtonDefaults.buttonElevation(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
        Button(
            onClick = { },
            border = BorderStroke(2.dp, Color.Yellow),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = text)
        }
    }
}

@Preview
@Composable
private fun PreviewButton() {
    Surface {
        ButtonExample(text = "Click me!")
    }
}