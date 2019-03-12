package com.company;

public class AddOns {


    private Tomatto tomatto;
    private Lettuce lettuce;
    private Carrot carrot;
    private Onions onions;

    public AddOns( Tomatto tomatto, Lettuce lettuce, Carrot carrot, Onions onions) {
        //this.price = price;
        this.tomatto = tomatto;
        this.lettuce = lettuce;
        this.carrot = carrot;
        this.onions = onions;
    }



    public Tomatto getTomatto() {
        return tomatto;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public Onions getOnions() {
        return onions;
    }




}
