package Structural.FlyWeight.Game.Solution.Interface.Impl;

import Structural.FlyWeight.Game.Solution.Enum.Type;
import Structural.FlyWeight.Game.Problem.Sprites;
import Structural.FlyWeight.Game.Solution.Interface.IRobot;

public class HumanoidRobot implements IRobot {
    private Type type;
    private Sprites body;  //Small 2d bitmap(Graphic object) very heavy object

    public HumanoidRobot(Type type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public Type getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use teh humanoid sprites object
        // and x & y co-ordinates to display robot
    }
}
