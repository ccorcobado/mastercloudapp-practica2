package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.models.Message;
import com.masterclouds.practica2.views.ViewController;

public class ResultCombinationView extends ViewController {    
    public ResultCombinationView(Controller controller) {
        super(controller);
    }
    
    public void printWinner() {
        if (this.controller.isLastProposeCombinationWinner()) 
            Message.WINNER.writeln();
    }
    
    public void printLooser() {
        if (this.controller.isLastAttempt())
            Message.LOOSER.writeln();
    }
    
    public void println() {
        Message.ATTEMPTS.writeln(this.controller.getGameAttempts());
        new SecretCombinationView(this.controller).writeln();
        ProposeCombinationView proposeCombinationView = new ProposeCombinationView(this.controller);
        for (int i = 0; i < this.controller.getGameAttempts(); i++) {
            proposeCombinationView.writeColors(i);
            proposeCombinationView.writeResult(i);
        }
        this.printWinner();
        this.printLooser();
    }
}