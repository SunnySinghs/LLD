package Structural.Decorator.Pizza.Abstract.Impl;

import Structural.Decorator.Pizza.Abstract.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
