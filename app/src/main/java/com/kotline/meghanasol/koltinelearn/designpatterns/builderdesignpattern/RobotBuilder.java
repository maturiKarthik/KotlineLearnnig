package com.kotline.meghanasol.koltinelearn.designpatterns.builderdesignpattern;

public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotArms();
    void buildRobotLegs();
    void buildRobotWeight();
    Robot getRobot();
}
