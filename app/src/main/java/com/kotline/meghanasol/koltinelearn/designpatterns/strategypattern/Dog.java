package com.kotline.meghanasol.koltinelearn.designpatterns.strategypattern;

public class Dog extends Animal {

    public Dog() {
       // super();
        flyingType = new CanotFly();
    }

    public  void digHole(){
        System.out.println("Dig hole");
    }
}


