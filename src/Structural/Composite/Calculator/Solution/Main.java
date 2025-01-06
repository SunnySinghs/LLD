package Structural.Composite.Calculator.Solution;

import Structural.Composite.Calculator.Solution.Enum.Operation;
import Structural.Composite.Calculator.Solution.Interface.ArithmeticExpression;
import Structural.Composite.Calculator.Solution.Interface.Impl.Expression;
import Structural.Composite.Calculator.Solution.Interface.Impl.Number;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression five = new Number(5);
        ArithmeticExpression four = new Number(4);
        ArithmeticExpression three = new Number(3);

        ArithmeticExpression addExpression = new Expression(four, three, Operation.ADD);
        ArithmeticExpression parentExpression = new Expression(five, addExpression, Operation.ADD);
        parentExpression.evaluate();
    }
}
