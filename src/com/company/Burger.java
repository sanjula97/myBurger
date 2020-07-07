package com.company;

public class Burger {
    private String breadRollType;
    private int meat;
    private int lettuce;
    private int tomato;
    private int carrot;
    int total = 15;

    public Burger( String breadType,int meat) {
        this.breadRollType = breadType;
        this.meat = meat;
        this.lettuce = 1;
        this.tomato = 1;
        this.carrot = 1;
    }

    public void totalPrice(){
        System.out.println(this.total);
    }
    public void addAdditions(String item){
        System.out.println(item);
    }


}
