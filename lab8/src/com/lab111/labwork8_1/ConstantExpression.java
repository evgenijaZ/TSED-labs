package com.lab111.labwork8_1;

/**
 * Terminal expression; a constant
 */
public class ConstantExpression implements Expression {
    /**
     * value of constant
     */
    private int number;


    ConstantExpression(int number) {
        this.number = number;
    }

    /**
     * @param context current state
     * @return value of constant
     */
    @Override
    public int interpret(Context context) {
        return number;
    }
}
