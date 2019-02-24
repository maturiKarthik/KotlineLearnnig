package com.kotline.meghanasol.koltinelearn.designpatterns.prototypedesignpattern;

public class Sheep implements Animal {


    public Sheep() {
        System.out.println("Sheep Being made");
    }

    @Override
    public Animal makecpoy() {

        Sheep sheep = null;
         try{
             sheep = (Sheep) super.clone();
             System.out.println("Clonning of sheep");
         }catch (CloneNotSupportedException e){
             e.printStackTrace();
         }

        return sheep;
    }
}
