package com.kotline.meghanasol.koltinelearn.designpatterns.builderdesignpattern;

public class Robot implements RobotPlan {

    private String head;
    private String arm;
    private String legs;
    private String weight;

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    @Override
    public void setArm(String arm) {
        this.arm = arm;
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void setRobotWeight(String weight) {
        this.weight = weight;
    }

    public String getHead() {
        return head;
    }

    public String getArm() {
        return arm;
    }

    public String getLegs() {
        return legs;
    }

    public String getWeight() {
        return weight;
    }
}
