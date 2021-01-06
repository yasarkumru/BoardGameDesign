package com.innova.game.board.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Player {

    private int order;

    public int getOrder() {
        return order;
    }
}
