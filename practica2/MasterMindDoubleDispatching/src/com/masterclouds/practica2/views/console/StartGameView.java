package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.models.Message;
import com.masterclouds.practica2.views.ViewController;

public class StartGameView extends ViewController {
    public StartGameView(Controller controller) {
        super(controller);
    }

    public void writeln() {
        Message.TITLE.writeln();
        new SecretCombinationView(this.controller).writeln();
    }
}
