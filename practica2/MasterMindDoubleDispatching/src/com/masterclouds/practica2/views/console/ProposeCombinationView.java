package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.models.Color;
import com.masterclouds.practica2.models.Combination;
import com.masterclouds.practica2.models.Message;
import com.masterclouds.practica2.models.Error;
import com.masterclouds.practica2.models.Result;
import com.masterclouds.practica2.views.ViewController;
import java.util.ArrayList;
import java.util.List;

public class ProposeCombinationView extends ViewController {
    public ProposeCombinationView(Controller controller) {
        super(controller);
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
    
    public List<Color> read() {
        Error error;
        List<Color> colors = new ArrayList<>();
        do {
                error = null;
                Message.PROPOSED_COMBINATION.write();
                String characters = this.console.readString();
                if (characters.length() != Combination.getWidth()) {
                    error = Error.WRONG_LENGTH;
                } else {
                    for (int i = 0; i < characters.length(); i++) {
                        Color color = Color.getInstance(characters.charAt(i));
                        if (color == null) {
                                error = Error.WRONG_CHARACTERS;
                        } else {
                            for (Color color1 : colors) {
                                if (color == color1) {
                                    error = Error.DUPLICATED;
                                }
                            }
                            colors.add(color);
                        }
                    }
                }
                if (error != null) {
                    error.writeln();
                    while (!colors.isEmpty()){
                        colors.remove(0);
                    }
                }
        } while (error != null);
        
        return colors;
    }
}