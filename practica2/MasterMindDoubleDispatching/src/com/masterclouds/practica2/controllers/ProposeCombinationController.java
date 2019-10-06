package com.masterclouds.practica2.controllers;

import com.masterclouds.practica2.models.Game;
import com.masterclouds.practica2.models.ProposeCombination;
import com.masterclouds.practica2.models.State;

public class ProposeCombinationController extends Controller {
    public ProposeCombinationController(Game game, State state) {
        super(game, state);
    }
    
    public void add(ProposeCombination proposeCombination) {
        this.game.addResult(proposeCombination);
        
        if (this.game.isFinished())
            this.state.next();
    }
    
    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}