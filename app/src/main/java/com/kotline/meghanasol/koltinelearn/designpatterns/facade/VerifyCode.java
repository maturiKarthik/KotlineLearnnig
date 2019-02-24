package com.kotline.meghanasol.koltinelearn.designpatterns.facade;

public class VerifyCode {
    private String pwd ;
    private int clientId;

    public VerifyCode(String pwd, int clientId) {
        this.pwd = pwd;
        this.clientId = clientId;
    }

    public boolean verifyCode(){
        if (pwd.equals("kar") && clientId == 123){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
