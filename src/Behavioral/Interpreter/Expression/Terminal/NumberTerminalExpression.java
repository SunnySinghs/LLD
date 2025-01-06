package Behavioral.Interpreter.Expression.Terminal;

import Behavioral.Interpreter.Context;
import Behavioral.Interpreter.Expression.AbstractExpression;

public class NumberTerminalExpression implements AbstractExpression {
    private String value;

    public NumberTerminalExpression(String value) {
        this.value = value;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.get(value);
    }
}
