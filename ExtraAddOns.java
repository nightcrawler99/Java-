package com.company;

public class ExtraAddOns extends AddOns {

    private Cucumber cucumber;
    private Cheese cheese;

    public ExtraAddOns(Tomatto tomatto, Lettuce lettuce, Carrot carrot, Onions onions, Cucumber cucumber, Cheese cheese) {
        super(tomatto, lettuce, carrot, onions);
        this.cucumber = cucumber;
        this.cheese = cheese;
    }

    public Cucumber getCucumber() {
        return cucumber;
    }

    public Cheese getCheese() {
        return cheese;
    }
}
