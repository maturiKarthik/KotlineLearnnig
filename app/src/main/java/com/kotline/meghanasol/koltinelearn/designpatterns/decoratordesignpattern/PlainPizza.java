package com.kotline.meghanasol.koltinelearn.designpatterns.decoratordesignpattern;

public class PlainPizza implements  Pizza {
    @Override
    public String getDescription() {
        return "This is a plain with";
    }

    @Override
    public double getCost() {
        return 4;
    }
}
