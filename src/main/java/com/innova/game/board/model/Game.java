package com.innova.game.board.model;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public abstract class Game {
    protected List<Player> players;
    protected Board board;
    private int round = 0;

    public boolean makeMove(Player player,String move){
        if(!getNextPlayer().equals(player))
            return false;
        if(doMakeMove(move)){
            round++;
            return true;
        }
        return false;
    }

    public Player getNextPlayer(){
        return players.get(round % players.size());
    }

    protected abstract boolean doMakeMove(String move);


}
