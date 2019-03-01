package com.kotline.meghanasol.koltinelearn.designpatterns.decoratordesignpattern;

public class Mozzarella extends  ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Dow");
        System.out.println("Adding Mozz");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",Mozeralla";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.50;
    }
}
