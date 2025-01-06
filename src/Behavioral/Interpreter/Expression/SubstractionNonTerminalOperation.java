package Behavioral.Interpreter.Expression;

import Behavioral.Interpreter.Context;

public class SubstractionNonTerminalOperation implements AbstractExpression{
    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public SubstractionNonTerminalOperation(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context ctx) {
        return leftExpression.interpret(ctx) - rightExpression.interpret(ctx);
    }
}
