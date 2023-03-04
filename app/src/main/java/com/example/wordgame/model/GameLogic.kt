package com.example.wordgame.model

class GameLogic {
    fun generateBoard(size: Int): Board {
        return Board(arrayOf(arrayOf(Pile(1))))
    }
}