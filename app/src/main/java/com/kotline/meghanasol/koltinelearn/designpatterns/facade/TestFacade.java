package com.kotline.meghanasol.koltinelearn.designpatterns.facade;

public class TestFacade {
    public static void main(String args[]){
        Facade facade = new Facade();
        facade.init();
        facade.display();
    }
}
