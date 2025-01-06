package Structural.Decorator.Pizza.Decorator;

import Structural.Decorator.Pizza.Abstract.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    protected BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost();
    }
}
