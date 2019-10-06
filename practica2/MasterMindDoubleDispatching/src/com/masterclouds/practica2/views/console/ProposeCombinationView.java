package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.models.Color;
import com.masterclouds.practica2.models.Message;
import com.masterclouds.practica2.models.Error;
import com.masterclouds.practica2.models.Result;
import com.masterclouds.practica2.views.ViewController;
import java.util.List;

public class ProposeCombinationView extends ViewController {
    public ProposeCombinationView(Controller controller) {
        super(controller);
    }

    public void println() {
        Message.PROPOSED_COMBINATION.write();
    }
    
    public void writeColors(int attempt) {
        List<Color> colorProposeCombination = this.controller.getColorsProposeCombination(attempt);
        for (Color color : colorProposeCombination) {
            color.write();
        }
    }
    
    public void writeResult(int attempt) {
        Result result = this.controller.getResultProposeCombination(attempt);
        Message.RESULT.writeln(result.getBlacks(), result.getWhites());
    }
    
    public void printError(Error error) {
        error.writeln();
    }
    
    public String read() {
        return this.console.readString();
    }
}