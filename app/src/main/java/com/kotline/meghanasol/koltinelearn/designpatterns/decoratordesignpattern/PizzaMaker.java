package com.kotline.meghanasol.koltinelearn.designpatterns.decoratordesignpattern;

public class PizzaMaker {
    public static void main(String args[]){

        Pizza pizza = new Mozzarella(new PlainPizza());
        System.out.println("Ingredients ::"+ pizza.getDescription());
        System.out.println("Cost ::"+pizza.getCost());
    }
}
