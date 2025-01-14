package org.example;

public class Pizza {

    private int price;
    private Boolean veg;

    private int extraCheese = 200;

    private int extraTopping = 150;

    private int backPackPrice = 50;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        }else {
            this.price = 500;
        }
        basePizzaPrice = this.price;
    }
public void addExtraCheese() {
        isExtraCheeseAdded = true;
    System.out.println("Extra cheese id added: " + price);
    this.price = this.price + extraCheese;
}
public void addExtraTopping() {
        isExtraToppingAdded = true;
        System.out.println("Extra topping id added: " + price);
        this.price = this.price + extraTopping;
}
public void takeAway(){
    System.out.println("Take away: " + price);
    this.price = this.price + backPackPrice;
}
public void getBill(){
        String bill = "";
        System.out.println("Pizza: " +basePizzaPrice);

        if(isExtraCheeseAdded){
        bill += "Extra Cheese is Added: "+extraCheese+ "\n";
        }
        if(isExtraToppingAdded){
            bill += "Extra Topping is Added: "+extraTopping+ "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take away from the the Pizza Store : "+backPackPrice+ "\n";
        }
        bill = "Bill: "+this.price + "\n";
        System.out.println("Bill: " + bill);
    }
}
