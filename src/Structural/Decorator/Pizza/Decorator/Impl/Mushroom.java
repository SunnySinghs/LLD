package Structural.Decorator.Pizza.Decorator.Impl;

import Structural.Decorator.Pizza.Abstract.BasePizza;
import Structural.Decorator.Pizza.Decorator.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    public Mushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return super.cost() + 80;
    }
}
