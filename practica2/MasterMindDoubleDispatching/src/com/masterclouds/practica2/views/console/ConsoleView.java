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
        ProposeCombination proposeCombinationReaded;
        
        do  {
            proposeCombinationView.println();
            proposeCombinationReaded = new ProposeCombination(proposeCombinationView.read());
            if (proposeCombinationReaded.hasError())
                proposeCombinationView.printError(proposeCombinationReaded.getError());
            else
                proposeCombinationController.add(proposeCombinationReaded);
        } while (proposeCombinationReaded.hasError());
        
        new ResultCombinationView(proposeCombinationController).println();
        
        if (proposeCombinationController.isFinished())
            proposeCombinationController.stateInResume();
    }

    @Override
    public void visit(ResumeController resumeController) {
        boolean continuePlaying = new ResumeGameView(resumeController).continuePlaying();
        resumeController.resume(continuePlaying);
    }
}