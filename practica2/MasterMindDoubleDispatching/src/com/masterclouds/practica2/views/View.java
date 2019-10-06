package com.masterclouds.practica2.views;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {
    public abstract void interact(Controller controller);
}