package com.company;

public class Main {

    public static void main(String[] args) {


        Meat meat=new Meat();

        BreadRoll breadRoll=new BreadRoll("");

        Hamberger ham=new Hamberger(breadRoll,meat,"normal");
        HealthyHamburger hamberger=new HealthyHamburger(breadRoll,meat);
        DeluxHamburger deluxHamburger=new DeluxHamburger(breadRoll,meat);
        double total=ham.getAddOnsCarrotPrice(1)+ham.getAddOnsLettucePrice(1)+ham.getAddOnsTomattoPrice(2)+
                ham.getAddOnsOnionPrice(1)+ham.getMeat().totalSelection(1)+hamberger.getAddOnsCarrotPrice(1)+
                hamberger.getAddOnsCheesePrice(1)+deluxHamburger.addOnsPrice()+deluxHamburger.getMeat().totalSelection(3)+
                ham.whiteBredRollPrice(2)+hamberger.brownBreadPrice(3);

        System.out.println("Total Bill: "+total +"$");

    }
}
