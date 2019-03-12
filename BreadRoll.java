package com.company;

public class BreadRoll {

    private String type;
    private double price;

    public BreadRoll(String type) {
        this.type = type;
        this.price = 1.50;
    }

    public String getType() {
        return type;
    }

    public double whiteBreadPrice(){
        return 1.50;
    }
    public double brownBreadPrice(){
        return 1.75;
    }
}
