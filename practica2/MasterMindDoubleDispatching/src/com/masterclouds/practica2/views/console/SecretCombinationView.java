package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.models.Message;
import com.masterclouds.practica2.views.ViewController;

public class SecretCombinationView extends ViewController {
    public SecretCombinationView(Controller controller) {
        super(controller);
    }
    
    public void writeln() {
        int lengthSecretCombination = this.controller.getLengthSecretCombination();
        for (int i = 0; i < lengthSecretCombination; i++)
            Message.SECRET.write();
        Message.NEW_LINE.write();        
    }
}