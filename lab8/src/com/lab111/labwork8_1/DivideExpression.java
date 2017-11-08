package com.lab111.labwork8_1;

public class DivideExpression implements Expression {
    /**
     * the left part of expression
     */
    private Expression leftExpression;
    /**
     * the right part of expression
     */
    private Expression rightExpression;

    /**
     * divides the left part by the right part of the expression
     * @param leftExpression the left part
     * @param rightExpression the right part
     */
    DivideExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) / rightExpression.interpret(context);
    }
}
