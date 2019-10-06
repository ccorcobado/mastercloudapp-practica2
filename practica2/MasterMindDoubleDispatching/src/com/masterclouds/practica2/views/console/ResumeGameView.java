package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.models.Message;
import com.masterclouds.practica2.utils.YesNoDialog;
import com.masterclouds.practica2.views.ViewController;

public class ResumeGameView extends ViewController {
    public ResumeGameView(Controller controller) {
        super(controller);
    }
    
    public boolean continuePlaying() {
        Message.RESUME.write();
        return new YesNoDialog().read();
    }
}
