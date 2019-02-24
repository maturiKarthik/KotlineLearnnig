package com.kotline.meghanasol.koltinelearn.designpatterns.builderdesignpattern;

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobo(){

    return  robotBuilder.getRobot();
    }

    public void makeRobot(){
        robotBuilder.buildRobotArms();
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotLegs();
        robotBuilder.buildRobotWeight();
    }
}
