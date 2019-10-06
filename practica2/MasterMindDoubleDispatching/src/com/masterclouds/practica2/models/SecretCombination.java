package com.masterclouds.practica2.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SecretCombination extends Combination {
    public SecretCombination() {
        super();
        
        this.colors.addAll(Arrays.asList(Color.values()));
        Random random = new Random(System.currentTimeMillis());
        final int erased = colors.size() - Combination.getWidth();
        for (int i = 0; i < erased; i++) {
                this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);
    }
    
    public Result getResult(ProposeCombination proposeCombination) {
        int blacks = 0;
        for (int i=0; i<this.colors.size(); i++) {
            if (proposeCombination.contains(this.colors.get(i), i)) {
                blacks++;
            }
        }
        int whites = 0;
        for (Color color : this.colors) {
            if (proposeCombination.contains(color)) {
                whites++;
            }
        }
        return new Result(blacks, whites - blacks);
    }
}
