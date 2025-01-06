package Structural.Bridge.Solution.Abstract.Impl;

import Structural.Bridge.Solution.Abstract.LivingThings;
import Structural.Bridge.Solution.Interface.BreatheImplementor;

public class Tree extends LivingThings {
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
