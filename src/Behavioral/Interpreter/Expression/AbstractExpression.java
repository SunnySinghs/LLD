package Behavioral.Interpreter.Expression;

import Behavioral.Interpreter.Context;

public interface AbstractExpression {
    int interpret(Context ctx);
}
