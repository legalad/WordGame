package com.example.wordgame.model

data class Board(
    val boardMatrix: Array<Array<Pile>>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Board

        if (!boardMatrix.contentDeepEquals(other.boardMatrix)) return false

        return true
    }

    override fun hashCode(): Int {
        return boardMatrix.contentDeepHashCode()
    }
}