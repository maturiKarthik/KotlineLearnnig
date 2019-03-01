package com.kotline.meghanasol.koltinelearn.designpatterns.decoratordesignpattern;

public abstract class ToppingDecorator implements Pizza {

    private  Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
