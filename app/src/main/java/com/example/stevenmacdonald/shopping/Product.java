package com.example.stevenmacdonald.shopping;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class Product {

    private int barcode;
    private String name;
    private double value;
    private boolean twoforone;

    public Product(int barcode,String name, double value, boolean twoforone){
        this.barcode = barcode;
        this.name = name;
        this.value = value;
        this.twoforone = twoforone;
    }

    public int getBarCode() {
        return barcode;
    }

    public void setBarCode(int barCode) {
        this.barcode = barCode;
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
