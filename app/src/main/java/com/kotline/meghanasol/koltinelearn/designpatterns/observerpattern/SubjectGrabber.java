package com.kotline.meghanasol.koltinelearn.designpatterns.observerpattern;

import java.util.ArrayList;


public class SubjectGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double appPrice;
    private double googPrice;
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAppPrice(double appPrice) {
        this.appPrice = appPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }



    public SubjectGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newobserver) {
       observers.add(newobserver);
    }

    @Override
    public void unregister(Observer deleteobserver) {
        observers.remove(deleteobserver);
        System.out.println("Removing the Observer"+deleteobserver);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers){
            observer.update(ibmPrice,appPrice,googPrice);
        }

    }
}
