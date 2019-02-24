package com.kotline.meghanasol.koltinelearn.designpatterns.strategypattern;

public class Animal {

    private String name;
    private int height;
    private  long weight;

    public  Fly flyingType;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public long getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public  String tryToFly(){
        return flyingType.fly();
    }

    public void setAbilityToFly(Fly newflyingType){
        flyingType = newflyingType;
    }
}
