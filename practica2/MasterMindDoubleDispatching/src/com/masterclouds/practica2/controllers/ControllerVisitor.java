package com.masterclouds.practica2.controllers;

public interface ControllerVisitor {
    void visit(StartController startController);

    void visit(ProposeCombinationController proposalCombinationController);

    void visit(ResumeController resumeController);
}
