package com.kotline.meghanasol.koltinelearn.designpatterns.prototypedesignpattern;

public class AnimalFactory {

    public  Animal getClone(Animal animal){
        return  animal.makecpoy();
    }
}
