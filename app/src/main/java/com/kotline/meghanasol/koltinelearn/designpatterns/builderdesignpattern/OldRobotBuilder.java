package com.kotline.meghanasol.koltinelearn.designpatterns.builderdesignpattern;

public class OldRobotBuilder implements RobotBuilder {

    private  Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Round");
    }

    @Override
    public void buildRobotArms() {
        robot.setArm("2");
    }

    @Override
    public void buildRobotLegs() {
        robot.setLegs("2");
    }

    @Override
    public void buildRobotWeight() {
         robot.setRobotWeight("350");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
