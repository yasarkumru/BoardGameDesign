package com.innova.game.board.chess;

import com.innova.game.board.model.Board;
import com.innova.game.board.model.Piece;
import com.innova.game.board.model.Spot;

public class ChessBoard extends Board {

    public ChessBoard(){
        initBoard();
    }

    public void initBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                addASpot(new Spot(i + "" + j));
            }
        }

        //create pieces and add them to starting spots
    }

    @Override
    public boolean makeMove(String move) {
        return false;
    }

    @Override
    public boolean isPieceSpotable(Piece piece) {
        return false;
    }

    @Override
    public boolean isMoveLegal(String move) {
        return false;
    }
}
