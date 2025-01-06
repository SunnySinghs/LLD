package Structural.Bridge.Solution.Abstract;

import Structural.Bridge.Solution.Interface.BreatheImplementor;

public abstract class LivingThings {
    protected BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
