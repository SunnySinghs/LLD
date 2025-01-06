package Structural.Decorator.Pizza.Decorator.Impl;

import Structural.Decorator.Pizza.Abstract.BasePizza;
import Structural.Decorator.Pizza.Decorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return super.cost() + 70;
    }
}
