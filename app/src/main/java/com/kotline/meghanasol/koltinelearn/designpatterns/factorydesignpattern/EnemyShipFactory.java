package com.kotline.meghanasol.koltinelearn.designpatterns.factorydesignpattern;

public class EnemyShipFactory {
    public static EnemyShip getEnemyShip(String input){
        EnemyShip enemyShip = null;
      switch (input){
          case "U":
              enemyShip = new UfoEnemyShip();
             break;
          case "R":
              enemyShip = new RocketEnemyShip();
              break;
      }
        return enemyShip;
    }
}
