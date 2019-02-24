package com.kotline.meghanasol.koltinelearn.designpatterns.strategypattern;

public class ExecuteMain {
    public static void main(String args[]){
        Dog fido = new Dog();
        fido.setName("Fido the Beast");
        fido.setHeight(34);
        fido.digHole();
        System.out.println(""+fido.getName()+"<---->"+fido.getHeight());
         fido.flyingType = new ItFlys();
        System.out.println(fido.tryToFly());
    }
}
