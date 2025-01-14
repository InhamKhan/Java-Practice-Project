package org.example;

public class Main {
    public static void main(String[] args)  {

//        Pizza basePizza = new Pizza(false);
//        basePizza.addExtraTopping();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();

    DeluxPizza dp = new DeluxPizza( true);
    dp.addExtraCheese();
    dp.addExtraTopping();
    dp.getBill();


    }

}