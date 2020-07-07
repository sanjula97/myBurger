package com.company;

public class HealthyBurger extends Burger {

    private int tako = 0;
    private int pepsi = 0;
    private int sauce = 0;
    private int hotGravy = 0;

    public HealthyBurger(String breadType, int meat) {
        super(breadType, meat);
    }

    public void addAdditions(String item){
        if(this.tako+this.pepsi+this.sauce+this.hotGravy < 5){
            switch (item){
                case "tako":
                    this.tako += 1;
                case "pepsi":
                    this.pepsi += 1;
                case "sauce":
                    this.sauce += 1;
                case "hotGravy":
                    this.hotGravy += 1;
                default:
                    System.out.println("Invalied addition!");

            }
        }else {
            System.out.println("You addition limit is over");
        }
    }

    @Override
    public void totalPrice() {
        int totalPrice =  this.tako * 5 + this.pepsi * 5 + this.sauce * 5 + this.hotGravy * 5 + total;
        System.out.println(totalPrice);
    }
}
