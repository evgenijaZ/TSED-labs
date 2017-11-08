package com.lab111.labwork8_1;

public class MultiplyExpression  implements Expression{
    /**
     * the left half of expression
     */
    private Expression leftExpression;
    /**
     * the right half of expression
     */
    private Expression rightExpression;
    /**
     * multiply the left part by the right part of the expression
     * @param leftExpression the left part
     * @param rightExpression the right part
     */
    MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }


    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
