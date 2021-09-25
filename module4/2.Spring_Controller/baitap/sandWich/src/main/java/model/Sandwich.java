package model;

import java.util.List;

public class Sandwich {
    private String[] condiments;

    public Sandwich() {
    }

    public Sandwich(String[] condiments) {
        this.condiments = condiments;
    }

    public String[] getCondiments() {
        return condiments;
    }

    public void setCondiments(String[] condiments) {
        this.condiments = condiments;
    }
    
}
