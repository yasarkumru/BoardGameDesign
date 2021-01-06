package com.innova.game.board.model;

import java.util.ArrayList;
import java.util.List;


public class Spot {
    private List<Piece> pieces = new ArrayList<>();
    private String coordinate;

    public Spot(String coordinate){
        this.coordinate = coordinate;
    }

    public boolean addAPiece (Piece piece){
        return pieces.add(piece);
    }

}
