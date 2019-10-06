package com.masterclouds.practica2.models;

import java.util.List;

public class ProposeCombination extends Combination {
    public ProposeCombination(List<Color> colors) {
        super();
        this.colors = colors;
    }
    
    public boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    public boolean contains(Color color) {
        for (Color color1 : this.colors) {
            if (color1 == color) {
                return true;
            }
        }
        return false;
    }
}