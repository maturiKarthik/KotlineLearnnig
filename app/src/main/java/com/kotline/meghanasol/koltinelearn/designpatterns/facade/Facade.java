package com.kotline.meghanasol.koltinelearn.designpatterns.facade;

public class Facade {

    private Welcome welcome;
    private VerifyCode verifyCode;
    private  WithDraw withDraw;

    public void init(){
        welcome = new Welcome();
        verifyCode = new VerifyCode("kar",123);
        withDraw = new WithDraw();
    }

    public void display(){
       if (verifyCode.verifyCode()){
           withDraw.msg();
       }

    }
}
