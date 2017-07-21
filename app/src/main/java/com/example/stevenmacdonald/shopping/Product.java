package com.example.stevenmacdonald.shopping;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class Product {

    private String name;
    private double value;
    private boolean twoforone;

    public Product(String name, double value, boolean twoforone){
        this.name = name;
        this.value = value;
        this.twoforone = twoforone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isTwoforone() {
        return twoforone;
    }

    public void setTwoforone(boolean twoforone) {
        this.twoforone = twoforone;
    }
}
