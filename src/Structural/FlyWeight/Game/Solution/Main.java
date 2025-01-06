package Structural.FlyWeight.Game.Solution;

import Structural.FlyWeight.Game.Solution.Enum.Type;
import Structural.FlyWeight.Game.Solution.Factory.RobotFactory;
import Structural.FlyWeight.Game.Solution.Interface.IRobot;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RobotFactory.createRobot(Type.HUMANOID);
        humanoidRobot1.display(1,1);

        IRobot humanoidRobot2 = RobotFactory.createRobot(Type.HUMANOID);
        humanoidRobot2.display(2,2);

        IRobot roboticDog1 = RobotFactory.createRobot(Type.ROBOTIC_DOGS);
        roboticDog1.display(3,3);

        IRobot roboticDog2 = RobotFactory.createRobot(Type.ROBOTIC_DOGS);
        roboticDog2.display(4,4);

    }
}
