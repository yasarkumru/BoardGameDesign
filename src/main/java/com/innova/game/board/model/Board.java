package com.innova.game.board.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Board {

    private List<Spot> spots = new ArrayList<>();

    public abstract boolean makeMove(String move);

    public boolean spotAPiece(Piece piece,Spot spot) {
        if (isPieceSpotable(piece)) {
            spot.addAPiece(piece);
            return true;
        }
        return false;
    }

    public boolean addASpot(Spot spot){
        return spots.add(spot);
    }

    public abstract boolean isPieceSpotable(Piece piece);

    public abstract boolean isMoveLegal(String move);


}
