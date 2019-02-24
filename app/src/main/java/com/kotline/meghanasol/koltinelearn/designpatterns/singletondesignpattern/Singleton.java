package com.kotline.meghanasol.koltinelearn.designpatterns.singletondesignpattern;

public class Singleton {
    private static Singleton newInstance = null;

    public static Singleton getNewInstance(){

        if (newInstance == null){
            System.out.println("Creating the Object");
            newInstance = new Singleton();
        }

        return newInstance;
    }

    private Singleton(){
        System.out.println("Creating One global instance of this class");
    }
}
