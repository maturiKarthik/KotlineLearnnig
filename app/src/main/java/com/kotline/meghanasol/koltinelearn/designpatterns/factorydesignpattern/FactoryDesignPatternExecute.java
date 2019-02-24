package com.kotline.meghanasol.koltinelearn.designpatterns.factorydesignpattern;

import java.io.Console;


public class FactoryDesignPatternExecute {
    public static void main(String args[]){

        String option = "R";
        initObject(EnemyShipFactory.getEnemyShip(option));

    }

    static void initObject(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
