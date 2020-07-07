package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger myBurger = burgerFactory("B");
        myBurger.totalPrice();
        myBurger.addAdditions("chips");
        myBurger.totalPrice();

    }

    public static Burger burgerFactory(String modal){
        switch (modal){
            case "B":
                return new BaseBurger("Garlic bread",2);
            case "H":
                return new HealthyBurger("Brown rye",2);
            case "D":
                return new DeluxBurger("Garlic bread",2,1,1);
            default:
                return null;
        }
    }
}
