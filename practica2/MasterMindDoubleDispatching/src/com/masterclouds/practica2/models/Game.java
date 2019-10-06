package com.masterclouds.practica2.models;

import java.util.ArrayList;
import java.util.List;

public final class Game {
    private static final int MAX_LONG = 10;
    
    private SecretCombination secretCombination;
    private List<ProposeCombination> proposesCombination;
    private List<Result> results;
    
    public Game() {
        this.clear();
    }
    
    public void clear() {
        this.secretCombination = new SecretCombination();
        this.proposesCombination = new ArrayList<>();
        this.results = new ArrayList<>();
    }
    
    public boolean isFinished() {
        if (this.isLastProposeCombinationWinner()) {
            return true;
        }
        return this.isLastAttempt();
    }
    
    public boolean isLastAttempt() {
        return MAX_LONG == this.getAttempts();
    }
    
    public Result getLastResultProposeCombination() {
        return this.results.get(this.getAttempts() - 1);
    }
    
    public boolean isLastProposeCombinationWinner() {
        return this.getLastResultProposeCombination().isWinner();
    }

    public int getAttempts() {
        return this.proposesCombination.size();
    }
    
    public void addResult(ProposeCombination proposeCombination) {
        this.proposesCombination.add(proposeCombination);
        this.results.add(this.secretCombination.getResult(proposeCombination));
    }
    
    public int getLengthSecretCombination() {
        return this.secretCombination.colors.size();
    }
    
    public List<Color> getColorsProposeCombination(int index) {
        return this.proposesCombination.get(index).colors;
    }
    
    public Result getResultProposeCombination(int index) {
        return this.results.get(index);
    }
}