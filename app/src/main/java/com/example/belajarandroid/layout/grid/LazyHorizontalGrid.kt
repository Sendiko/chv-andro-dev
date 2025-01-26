package com.example.belajarandroid.layout.grid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
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

@Composable
fun LazyHorizontalGridExample(
    modifier: Modifier = Modifier,
    rows: GridCells,
    horizontalArrangement: Arrangement.Horizontal,
    verticalArrangement: Arrangement.Vertical,
    contentPadding: PaddingValues = PaddingValues(8.dp)
) {
    LazyHorizontalGrid(
        rows = rows,
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
private fun LazyHorizontalGridExamplePrev() {
    Surface {
        LazyHorizontalGridExample(
            rows = GridCells.Fixed(3),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        )
    }
}