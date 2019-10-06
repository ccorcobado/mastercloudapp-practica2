package com.masterclouds.practica2.controllers;

import com.masterclouds.practica2.models.Color;
import com.masterclouds.practica2.models.State;
import com.masterclouds.practica2.models.Game;
import com.masterclouds.practica2.models.Result;
import java.util.List;

public abstract class Controller {
    protected final Game game;
    protected final State state;
    
    protected Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }
    
    public int getGameAttempts() {
        return this.game.getAttempts();
    }
    
    public List<Color> getColorsProposeCombination(int index) {
        return this.game.getColorsProposeCombination(index);
    }
    
    public Result getResultProposeCombination(int index) {
        return this.game.getResultProposeCombination(index);
    }
    
    public boolean isLastProposeCombinationWinner() {
        return this.game.isLastProposeCombinationWinner();
    }
    
    public boolean isLastAttempt() {
        return this.game.isLastAttempt();
    }
    
    public abstract void accept(ControllerVisitor controllerVisitor);
}
