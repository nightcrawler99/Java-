package com.company;

public class Meat {

    private double price=1.25;

    public double getPrice() {
        return price;
    }

    public double totalSelection(int select) {
        return select*price;
    }


}
