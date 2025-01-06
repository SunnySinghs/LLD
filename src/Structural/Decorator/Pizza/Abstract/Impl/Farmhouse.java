package Structural.Decorator.Pizza.Abstract.Impl;

import Structural.Decorator.Pizza.Abstract.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
