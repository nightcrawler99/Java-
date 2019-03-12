package com.company;

public class Hamberger {

    private BreadRoll breadRoll;
    private Meat meat;
   // private AddOns addOns;
    private String type;

    public Hamberger(BreadRoll breadRoll, Meat meat,String type) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.type=type;


    }
    AddOns addOns=new AddOns(new Tomatto(),new Lettuce(),new Carrot(),new Onions());



    public double whiteBredRollPrice(int quantity){
        return breadRoll.whiteBreadPrice()*quantity;
    }
    public double brownBreadPrice(int quantity){
        return breadRoll.brownBreadPrice()*quantity;
    }
    public double getAddOnsTomattoPrice(int selection) {



            return addOns.getTomatto().getPrice() * selection;

    }
    public double getAddOnsCarrotPrice(int selection){

           return addOns.getCarrot().getPrice() * selection;

    }
    public double getAddOnsOnionPrice(int selection){


            return addOns.getOnions().getPrice() * selection;

    }
    public double getAddOnsLettucePrice(int selection){

            return addOns.getLettuce().getPrice() * selection;

    }

    public String getType() {
        return type;
    }

    public BreadRoll getBreadRoll() {
        return breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }


}
class HealthyHamburger extends Hamberger{

    public HealthyHamburger(BreadRoll breadRoll, Meat meat) {
        super(breadRoll, meat, "Healthy Hamburger");
    }

    @Override
    public double whiteBredRollPrice(int quantity) {
        System.out.println("not available for this deal");
        return 0;
    }

    ExtraAddOns extraAddOns=new ExtraAddOns(new Tomatto(),new Lettuce(),new Carrot(),new Onions(),new Cucumber(),new Cheese());

    public double getAddOnsCheesePrice(int selection) {

        return extraAddOns.getCheese().getPrice() * selection;

    }
    public double getAddOnsCucumberPrice(int selection) {

        return extraAddOns.getCucumber().getPrice() * selection;

    }



}
class DeluxHamburger extends Hamberger{
    public DeluxHamburger(BreadRoll breadRoll, Meat meat) {
        super(breadRoll, meat, "Delux");
    }

    @Override
    public double getAddOnsCarrotPrice(int selection) {
        System.out.println("not available for this deal");
        return 0;
    }

    @Override
    public double getAddOnsOnionPrice(int selection) {
        System.out.println("not available for this deal");
        return 0;
    }

    @Override
    public double getAddOnsTomattoPrice(int selection) {
        System.out.println("not available for this deal");
        return 0;
    }

    @Override
    public double getAddOnsLettucePrice(int selection) {
        System.out.println("not available for this deal");
        return 0;
    }

    public double addOnsPrice(){
        return 1.50;//price for drink and chips
    }
}

