package com.example.belajarandroid.layout.lazy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
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
 * Contoh penggunaan LazyRow untuk layout component
 * Silahkan untuk explore di fungsi @Preview
 *
 * @param horizontalArrangement untuk mengatur jarak antar item secara horizontal
 * @param verticalAlignment untuk mengatur peletakkan item secara vertikal
 * @param contentPadding untuk memberikan jarak dari konten kita ke LazyRow
 *
 * */
@Composable
fun LazyRowExample(
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal,
    verticalAlignment: Alignment.Vertical,
    contentPadding: PaddingValues = PaddingValues(8.dp)
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = verticalAlignment,
        contentPadding = contentPadding
    ) {
        items(5) { number ->
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
        items(5) { number ->
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
        items(5) { number ->
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
        items(5) { number ->
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
private fun LazyRowExamplePrev() {
    Surface {
        LazyRowExample(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        )
    }
}