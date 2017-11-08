package com.lab111.labwork8_1;

public class MinusExpression implements Expression {
    /**
     * the left half of expression
     */
    private Expression leftExpression;
    /**
     * the right half of expression
     */
    private Expression rightExpression;

    /**
     * subtract the right part out of the left part of the expression
     * @param leftExpression the left part
     * @param rightExpression the right part
     */
    MinusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}
