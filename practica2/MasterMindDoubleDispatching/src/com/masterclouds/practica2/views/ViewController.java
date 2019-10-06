package com.masterclouds.practica2.views;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.utils.WithConsoleModel;

public abstract class ViewController  extends WithConsoleModel {
    protected final Controller controller;
    
    protected ViewController(Controller controller) {
        this.controller = controller;
    }
}
