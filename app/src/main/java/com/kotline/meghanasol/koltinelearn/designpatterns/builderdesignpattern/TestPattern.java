package com.kotline.meghanasol.koltinelearn.designpatterns.builderdesignpattern;

public class TestPattern {
    public static  void  main(String[] args){

        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();
        Robot robot = robotEngineer.getRobo();
        System.out.println(" Robot Head  ::" +robot.getHead());
        System.out.println(" Robot Arm  ::" +robot.getArm());
        System.out.println(" Robot Legs  ::" +robot.getLegs());
        System.out.println(" Robot Weight  ::" +robot.getWeight());

    }
}
