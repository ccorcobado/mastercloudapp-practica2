package com.masterclouds.practica2.utils;

public abstract class WithConsoleModel {
    protected final Console console;

    protected WithConsoleModel() {
        this.console = new Console();
    }
}