package Structural.FlyWeight.Game.Problem;

import Structural.FlyWeight.Game.Problem.Enum.Type;

public class Robot {
    int x;
    int y;
    Type type;
    Sprites body;  //Small 2d bitmap(Graphic object) very heavy object

    public Robot(int x, int y, Type type, Sprites body) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.body = body;
    }

    // setter and getter
}
