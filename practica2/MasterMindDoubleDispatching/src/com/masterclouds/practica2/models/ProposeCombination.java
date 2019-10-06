package com.masterclouds.practica2.models;

public class ProposeCombination extends Combination {
    private final Error errorProposeCombination;
    
    public ProposeCombination(String proposeCombinationNoFormatting) {
        super();
        this.errorProposeCombination = this.populate(proposeCombinationNoFormatting);
    }
    
    private Error populate(String proposeCombinationNoFormatting) {
        Error error = null;
        if (proposeCombinationNoFormatting.length() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < proposeCombinationNoFormatting.length(); i++) {
                Color color = Color.getInstance(proposeCombinationNoFormatting.charAt(i));
                if (color == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    for (Color color1 : this.colors) {
                        if (color == color1) {
                            error = Error.DUPLICATED;
                        }
                    }
                    this.colors.add(color);
                }
            }
        }
        
        return error;
    }
    
    public boolean hasError() {
        return this.getError() != null;
    }
    
    public Error getError() {
        return this.errorProposeCombination;
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