package com.kotline.meghanasol.koltinelearn.designpatterns.observerpattern;



public interface Subject {
     void register(Observer observer);
     void unregister(Observer observer);
     void notifyObserver();
}
