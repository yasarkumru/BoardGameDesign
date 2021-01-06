package com.innova.game.board.model;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public abstract class Piece {

    private Player owner;
    protected String coordinate;

    public abstract List<String> getLegalMoves();

    public Player getOwner() {
        return owner;
    }
}
