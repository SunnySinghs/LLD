package Behavioral.Interpreter;

import Behavioral.Interpreter.Expression.AbstractExpression;
import Behavioral.Interpreter.Expression.AdditionNonTerminalExpression;
import Behavioral.Interpreter.Expression.MultiplicationNonTerminalExpression;
import Behavioral.Interpreter.Expression.Terminal.NumberTerminalExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("x", 10);
        context.put("y", 20);

        AbstractExpression expression = new MultiplicationNonTerminalExpression(
                new MultiplicationNonTerminalExpression(
                        new NumberTerminalExpression("x"),
                        new NumberTerminalExpression("y")
                ),
                new NumberTerminalExpression("x")
        );

        System.out.println(expression.interpret(context));

        AbstractExpression expression1 = new MultiplicationNonTerminalExpression(
                new AdditionNonTerminalExpression(
                        new NumberTerminalExpression("x"),
                        new NumberTerminalExpression("y")
                ),
                new AdditionNonTerminalExpression(
                        new NumberTerminalExpression("x"),
                        new NumberTerminalExpression("y")
                )
        );

        System.out.println(expression1.interpret(context));

        AbstractExpression expression2 = Interpreter.parse("x y + x -");
        System.out.println(expression2.interpret(context));
    }
}
