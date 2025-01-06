package Structural.Decorator.Pizza;

import Structural.Decorator.Pizza.Abstract.BasePizza;
import Structural.Decorator.Pizza.Abstract.Impl.VegDelight;
import Structural.Decorator.Pizza.Decorator.Impl.ExtraCheese;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new VegDelight();
        System.out.println("Veg Delight Price: " + basePizza.cost());

        ExtraCheese extraCheese = new ExtraCheese(basePizza);
        System.out.println("Veg Delight with Extra Cheese Price: " + extraCheese.cost());
    }
}
