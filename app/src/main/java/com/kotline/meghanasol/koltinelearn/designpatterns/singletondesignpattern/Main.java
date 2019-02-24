package com.kotline.meghanasol.koltinelearn.designpatterns.singletondesignpattern;

public class Main {
    public static void main(String args[]){

        Singleton singleton = Singleton.getNewInstance();
        System.out.println(System.identityHashCode(singleton));

        Singleton singleton1 = Singleton.getNewInstance();
        System.out.println(System.identityHashCode(singleton1));

    }
}
