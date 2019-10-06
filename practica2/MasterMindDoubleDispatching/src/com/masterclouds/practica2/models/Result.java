package com.masterclouds.practica2.models;

public class Result {
    private final int blacks;
    private final int whites;

    public Result(int blacks, int whites) {
        assert blacks >= 0;
        assert whites >= 0;
        
        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean isWinner() {
        return this.blacks == Combination.getWidth();
    }
    
    public int getBlacks() {
        return this.blacks;
    }
    
    public int getWhites() {
        return this.whites;
    }
}
