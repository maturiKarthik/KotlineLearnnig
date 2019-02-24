package com.kotline.meghanasol.koltinelearn.designpatterns.observerpattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double appPrice;
    private double googPrice;

    private SubjectGrabber subjectGrabber;

    private static int OBSERVERID = 0;
    private  int observerIndex ;

    public StockObserver(SubjectGrabber subjectGrabber) {
       this.observerIndex = ++ OBSERVERID;
        this.subjectGrabber = subjectGrabber;
        System.out.println("The new Observer     ::>"+observerIndex);
        subjectGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googPrice) {
        this.appPrice = applePrice;
        this.ibmPrice = ibmPrice;
        this.googPrice = googPrice;
        printPrice();
    }


    private  void printPrice(){
        System.out.println("IBM PRICE ::"+ibmPrice+"    Apple PRICE ::"+appPrice+"     Google PRICE ::"+googPrice);
    }
}
