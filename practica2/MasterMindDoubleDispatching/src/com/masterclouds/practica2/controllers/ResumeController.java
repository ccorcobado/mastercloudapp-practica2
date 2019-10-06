package com.masterclouds.practica2.controllers;

import com.masterclouds.practica2.models.Game;
import com.masterclouds.practica2.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }
    
    public void resume(boolean newGame) {
        if (newGame) {
            this.game.clear();
            this.state.reset();
        } else {
            this.state.next();
        }
    }
    
    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}