package com.kotline.meghanasol.koltinelearn.designpatterns.factorydesignpattern;

public abstract class EnemyShip {

    private  String name;
    private  double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(Double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip(){
        System.out.println(name + "Follow Hero Ship");
    }
    public void displayEnemyShip(){
        System.out.println("Display Enemy Ship  >>"+getName());
    }
    public void enemyShipShoots(){
        System.out.println("Shoot enemy Ship >>"+getAmtDamage());
    }


}
