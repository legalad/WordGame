package com.example.wordgame.ui.components

import android.widget.GridLayout.Alignment
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wordgame.model.Pile

@Composable
fun GameBoard(size: Int, piles: List<Pile>) {
    val gridSize = size*40
    Column(modifier = Modifier.size(gridSize.dp)) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(size)
        ) {
            items(piles) { pile ->
                BoardPile(pile = pile)
            }
        }
    }
}

@Composable
fun BoardPile(pile: Pile) {
    Card(
        modifier = Modifier
            .padding(2.dp)
            .size(50.dp)
            .wrapContentSize(androidx.compose.ui.Alignment.Center)
    ) {
        Text(
            text = pile.multiplier.toString() + "x", modifier = Modifier
                .padding(10.dp)
        )
    }
}

@Preview
@Composable
fun PilePreview() {
   BoardPile(pile = Pile(2))
}

@Preview
@Composable
fun GameBoardPrev() {
    GameBoard(
        size = 4,
        piles = listOf(
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2),
            Pile(2)
        )
    )
}