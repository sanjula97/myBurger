package com.company;

public class DeluxBurger extends Burger {

    private int hotDog;
    private int coffi;
    private int sauce = 1;
    private int hotGravy = 1;
    public DeluxBurger(String breadType,int meat,int hotDog,int coffi) {
        super(breadType,meat);
        this.hotDog = hotDog;
        this.coffi = coffi;
    }

    @Override
    public void totalPrice() {
        int totalPrice =  this.hotDog * 5 + this.coffi * 5 + this.sauce * 5 + this.hotGravy * 5 + total;
        System.out.println(totalPrice);
    }
}
