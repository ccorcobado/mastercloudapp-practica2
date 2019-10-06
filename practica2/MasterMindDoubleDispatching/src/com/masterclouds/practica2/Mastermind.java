package com.masterclouds.practica2;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.controllers.Logic;
import com.masterclouds.practica2.views.View;
import com.masterclouds.practica2.views.console.ConsoleView;

public class Mastermind {
    private final Logic logic;
    private final View view;

    private Mastermind() {
        this.logic = new Logic();
        this.view = new ConsoleView();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    public void play() {
        Controller controller;
        
        do {
            controller = this.logic.getController();
            if (controller != null)
                this.view.interact(controller);
        } while (controller != null);
    }
}