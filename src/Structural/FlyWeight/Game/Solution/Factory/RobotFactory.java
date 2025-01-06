package Structural.FlyWeight.Game.Solution.Factory;

import Structural.FlyWeight.Game.Problem.Sprites;
import Structural.FlyWeight.Game.Solution.Enum.Type;
import Structural.FlyWeight.Game.Solution.Interface.IRobot;
import Structural.FlyWeight.Game.Solution.Interface.Impl.HumanoidRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<Type, IRobot> cache = new HashMap<>();

    public static IRobot createRobot(Type type) {
        if(cache.containsKey(type)) {
            return cache.get(type);
        } else {
            if (type.equals(Type.HUMANOID)) {
                Sprites humanoidSprites = new Sprites();
                IRobot humanoidRobot = new HumanoidRobot(Type.HUMANOID, humanoidSprites);
                cache.put(Type.HUMANOID, humanoidRobot);
                return humanoidRobot;
            } else if (type.equals(Type.ROBOTIC_DOGS)) {
                Sprites roboticDogSprites = new Sprites();
                IRobot roboticDog = new HumanoidRobot(Type.ROBOTIC_DOGS, roboticDogSprites);
                cache.put(Type.ROBOTIC_DOGS, roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
