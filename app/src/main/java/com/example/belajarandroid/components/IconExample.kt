package com.example.belajarandroid.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajarandroid.R

@Composable
fun IconExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = "check",
            modifier = Modifier.size(52.dp)
        )
        Icon(
            painter = painterResource(R.drawable.ic_round_qr_code),
            contentDescription = "check",
        )
        Icon(
            painter = painterResource(R.drawable.ic_round_qr_code_vector),
            contentDescription = "check",
            modifier = Modifier.size(52.dp)
        )
    }
}

@Preview
@Composable
private fun PreviewIcon() {
    Surface {
        IconExample()
    }
}