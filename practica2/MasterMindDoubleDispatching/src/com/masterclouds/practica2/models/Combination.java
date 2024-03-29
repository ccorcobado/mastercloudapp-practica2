package com.masterclouds.practica2.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {
    private static final int WIDTH = 4;

    protected List<Color> colors;

    protected Combination (){
        this.colors = new ArrayList<>();
    }

    public static int getWidth() {
        return Combination.WIDTH;
    }
}