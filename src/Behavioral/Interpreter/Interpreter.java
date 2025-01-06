package Behavioral.Interpreter;

import Behavioral.Interpreter.Expression.*;
import Behavioral.Interpreter.Expression.Terminal.NumberTerminalExpression;

import java.util.Stack;

public class Interpreter {
    public static AbstractExpression parse(String expression) {
        Stack<AbstractExpression> stack = new Stack<>();

        for(String token: expression.split(" ")) {
            if (isOperator(token)) {
                AbstractExpression right = stack.pop();
                AbstractExpression left = stack.pop();

                AbstractExpression exprs = getOperaterInstance(token, left, right);
                stack.push(exprs);
            } else {
                stack.push(new NumberTerminalExpression(token));
            }
        }
        return stack.pop();
    }


    private static AbstractExpression getOperaterInstance(String token, AbstractExpression left,
                                                          AbstractExpression right) {
        if ("+".equals(token)) {
            return new AdditionNonTerminalExpression(left, right);
        } else if ("-".equals(token)) {
            return new SubstractionNonTerminalOperation(left, right);
        } else if ("*".equals(token)) {
            return new MultiplicationNonTerminalExpression(left, right);
        } else if ("/".equals(token)) {
            return new DivisionNonTerminalExpression(left, right);
        }
        return null;
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }
}
