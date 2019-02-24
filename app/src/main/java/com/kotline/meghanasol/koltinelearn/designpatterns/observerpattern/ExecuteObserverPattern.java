package com.kotline.meghanasol.koltinelearn.designpatterns.observerpattern;

public class ExecuteObserverPattern {

    public static void main(String args[]){

        SubjectGrabber subjectGrabber = new SubjectGrabber();
        StockObserver stockObserver1 = new StockObserver(subjectGrabber);
        subjectGrabber.setAppPrice(122);
        subjectGrabber.setGoogPrice(133);
        subjectGrabber.setIbmPrice(1222);


        SubjectGrabber subjectGrabber2 = new SubjectGrabber();
        StockObserver stockObserver2 = new StockObserver(subjectGrabber2);
        subjectGrabber.setAppPrice(12);
        subjectGrabber.setGoogPrice(13);
        subjectGrabber.setIbmPrice(1);

    }
}
