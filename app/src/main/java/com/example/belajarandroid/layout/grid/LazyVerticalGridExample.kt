package com.example.belajarandroid.layout.grid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
 * Contoh penggunaan LazyVerticalGrid untuk layout component
 * Silahkan untuk explore di fungsi @Preview
 *
 * @param verticalArrangement untuk mengatur jarak antar item secara vertikal
 * @param horizontalArrangement untuk mengatur jarak antar item secara horizontal
 * @param contentPadding untuk memberikan jarak dari konten kita ke LazyVerticalGrid
 * @param columns untuk menentukan jumlah row di grid
 *
 * */
@Composable
fun LazyVerticalGridExample(
    modifier: Modifier = Modifier,
    columns: GridCells,
    horizontalArrangement: Arrangement.Horizontal,
    verticalArrangement: Arrangement.Vertical,
    contentPadding: PaddingValues = PaddingValues(8.dp)
) {
    LazyVerticalGrid(
        columns = columns,
        verticalArrangement = verticalArrangement,
        horizontalArrangement = horizontalArrangement,
        contentPadding = contentPadding
    ) {
        items(5) { number ->
            Box(
                modifier = Modifier
                    .background(color = boxColors[number]),
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
                    .background(color = boxColors[number]),
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
                    .background(color = boxColors[number]),
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
                    .background(color = boxColors[number]),
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
private fun LazyVerticalGridExamplePrev() {
    Surface {
        LazyVerticalGridExample(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        )
    }
}