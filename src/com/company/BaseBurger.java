package com.company;

public class BaseBurger extends Burger {
    private int chips =0;
    private int coke = 0;
    private int sauce = 0;
    private int hotGravy = 0;

    public BaseBurger(String breadType,int meat) {
        super(breadType,meat);
    }

    public void addAdditions(String item){
        if(this.chips+this.coke+this.sauce+this.hotGravy < 5){
            switch (item){
                case "chips":
                    this.chips += 1;
                    break;
                case "coke":
                    this.coke += 1;
                    break;
                case "sauce":
                    this.sauce += 1;
                    break;
                case "hotGravy":
                    this.hotGravy += 1;
                    break;
                default:
                    System.out.println("Invalied addition!");

            }
        }else {
            System.out.println("You addition limit is over");
        }
    }

    @Override
    public void totalPrice() {
        int totalPrice =  this.chips * 5 + this.coke * 5 + this.sauce * 5 + this.hotGravy * 5 + total;
        System.out.println(totalPrice);
    }
}
