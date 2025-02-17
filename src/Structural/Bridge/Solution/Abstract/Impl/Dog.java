package Structural.Bridge.Solution.Abstract.Impl;

import Structural.Bridge.Solution.Abstract.LivingThings;
import Structural.Bridge.Solution.Interface.BreatheImplementor;

public class Dog extends LivingThings {
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
