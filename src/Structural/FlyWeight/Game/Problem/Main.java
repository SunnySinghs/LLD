package Structural.FlyWeight.Game.Problem;

import Structural.FlyWeight.Game.Problem.Enum.Type;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i=0; i<5; i++) {   //Suppose loop executes 5L times
            Sprites humanoidSprites = new Sprites();
            Robot humanoidRobot = new Robot(x+1, y+1, Type.HUMANOID, humanoidSprites);
        }

        for (int i=0; i<5; i++) {   //Suppose loop executes 5L times
            Sprites RoboticDogSprites = new Sprites();
            Robot humanoidRobot = new Robot(x+1, y+1, Type.ROBOTIC_DOGS, RoboticDogSprites);
        }
    }
}
