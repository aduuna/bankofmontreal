package com.bankofmontreal;

public abstract class Product{
    private final String ID;
    private double value;

    public Product(String ID, double value) {
        this.ID = ID;
        this.value = value;
    }

    public Product() {
        this.ID = "1";
        this.value = 0.0;
    }

    public String getID() { return ID; }

    public double getValue() { return value; }



}
