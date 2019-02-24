package com.kotline.meghanasol.koltinelearn.designpatterns.prototypedesignpattern;

public class TestClonning {
    public static void main(String args[]){
        AnimalFactory animalFactory = new AnimalFactory();
        Sheep sheep = new Sheep();
        animalFactory.getClone(sheep);
    }
}
