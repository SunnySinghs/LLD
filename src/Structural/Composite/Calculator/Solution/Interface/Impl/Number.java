package Structural.Composite.Calculator.Solution.Interface.Impl;

import Structural.Composite.Calculator.Solution.Interface.ArithmeticExpression;

public class Number implements ArithmeticExpression {
    int value;

    public Number(int value) {
        this.value = value;
    }


    @Override
    public int evaluate() {
        System.out.println("Number value is: "+ value);
        return value;
    }
}
