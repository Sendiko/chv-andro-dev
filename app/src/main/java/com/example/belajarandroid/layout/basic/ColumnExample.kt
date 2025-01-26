package com.example.belajarandroid.layout.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajarandroid.layout.utils.boxColors

/**
 *
 * Contoh penggunaan Column untuk layout component
 * Silahkan untuk explore di fungsi @Preview
 *
 * @param verticalArrangement untuk mengatur jarak antar item secara vertikal
 * @param horizontalAlignment untuk mengatur peletakkan item secara horizontal
 *
* */
@Composable
fun ColumnExample(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical,
    horizontalAlignment: Alignment.Horizontal
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment
    ) {
        repeat(5) { number ->
            Box(
                modifier = Modifier
                    .background(color = boxColors[number])
                    .size(128.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = "Halo, aku item nomer ${number + 1}",
                    fontWeight = FontWeight.Bold,
                    color = contentColorFor(boxColors[number])
                )
            }
        }
    }
}

@Preview
@Composable
private fun ColumnExamplePrev() {
    Surface {
        ColumnExample(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
    }
}