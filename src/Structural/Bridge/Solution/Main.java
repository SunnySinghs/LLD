package Structural.Bridge.Solution;

import Structural.Bridge.Solution.Abstract.Impl.Dog;
import Structural.Bridge.Solution.Abstract.Impl.Fish;
import Structural.Bridge.Solution.Abstract.Impl.Tree;
import Structural.Bridge.Solution.Abstract.LivingThings;
import Structural.Bridge.Solution.Interface.Impl.LandBreatheImplementor;
import Structural.Bridge.Solution.Interface.Impl.TreeBreatheImplementor;
import Structural.Bridge.Solution.Interface.Impl.WaterBreatheImplementor;

public class Main {
    public static void main(String[] args) {
        LivingThings dogObject = new Dog(new LandBreatheImplementor());
        dogObject.breatheProcess();

        LivingThings fishObjects = new Fish(new WaterBreatheImplementor());
        fishObjects.breatheProcess();

        LivingThings treeObjects = new Tree(new TreeBreatheImplementor());
        treeObjects.breatheProcess();
    }
}
