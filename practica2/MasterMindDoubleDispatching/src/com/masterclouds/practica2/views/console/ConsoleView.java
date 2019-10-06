package com.masterclouds.practica2.views.console;

import com.masterclouds.practica2.controllers.Controller;
import com.masterclouds.practica2.controllers.ProposeCombinationController;
import com.masterclouds.practica2.controllers.ResumeController;
import com.masterclouds.practica2.controllers.StartController;
import com.masterclouds.practica2.models.ProposeCombination;
import com.masterclouds.practica2.views.View;

public class ConsoleView extends View {
    
    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startController.start();
        new StartGameView(startController).writeln();
    }
    
    @Override
    public void visit(ProposeCombinationController proposeCombinationController) {
        ProposeCombinationView proposeCombinationView = new ProposeCombinationView(proposeCombinationController);        
        ProposeCombination proposeCombinationReaded = new ProposeCombination(proposeCombinationView.read());
        proposeCombinationController.add(proposeCombinationReaded);        
        new ResultCombinationView(proposeCombinationController).println();
    }

    @Override
    public void visit(ResumeController resumeController) {
        boolean continuePlaying = new ResumeGameView(resumeController).continuePlaying();
        resumeController.resume(continuePlaying);
    }
}